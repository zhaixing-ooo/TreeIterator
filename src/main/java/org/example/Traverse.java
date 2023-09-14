package org.example;


public class Traverse {
    public static void main(String[] args) {

    }

    public void preOrderTraverse1(TreeNode root) {
        if (root != null) {
            inOrderTraverse1(root.left);
            System.out.print(root.val + "  ");
            inOrderTraverse1(root.right);
        }
    }
    public void inOrderTraverse1(TreeNode root) {
        if (root != null) {
            inOrderTraverse1(root.left);
            System.out.print(root.val + "  ");
            inOrderTraverse1(root.right);
        }
    }
}