package org.example;

public class SquirrelTree {
    private Squirrel squirrel;
    private SquirrelTree left;
    private SquirrelTree right;
    private SquirrelTree parent;
    
    public SquirrelTree(Squirrel squirrel) {
        this.squirrel = squirrel;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
    
    public void attachChild(SquirrelTree child, String position) {
        if (position.equals("left")) {
            this.left = child;
        } else if (position.equals("right")) {
            this.right = child;
        } else {
            throw new IllegalArgumentException("Position must be either 'left' or 'right'");
        }
        child.parent = this;
    }
    
    public SquirrelTree left() {
        return this.left;
    }
    
    public SquirrelTree right() {
        return this.right;
    }
    
    public Squirrel getSquirrel() {
        return this.squirrel;
    }
    
    public void traverseInOrder() {
        if (left != null) {
            left.traverseInOrder();
        }
        System.out.println(squirrel.getName());
        if (right != null) {
            right.traverseInOrder();
        }
    }
    
    public void traversePreOrder() {
        System.out.println(squirrel.getName());
        if (left != null) {
            left.traversePreOrder();
        }
        if (right != null) {
            right.traversePreOrder();
        }
    }
    
    public void traversePostOrder() {
        if (left != null) {
            left.traversePostOrder();
        }
        if (right != null) {
            right.traversePostOrder();
        }
        System.out.println(squirrel.getName());
    }
}
