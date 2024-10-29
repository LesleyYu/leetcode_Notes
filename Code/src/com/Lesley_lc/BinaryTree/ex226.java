package com.Lesley_lc.BinaryTree;

// 226. Invert Binary Tree

public class ex226 {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            if (root.left == null && root.right == null) {
                return new TreeNode(root.val);
            } else if (root.left != null && root.right != null) {
                return new TreeNode(root.val, invertTree(root.right), invertTree(root.left));
            } else {
                if (root.left != null) {
                    return new TreeNode(root.val, null, invertTree(root.left));
                } else {
                    return new TreeNode(root.val, invertTree(root.right), null);
                }
            }
        }
    }
}
