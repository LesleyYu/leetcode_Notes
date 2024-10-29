package com.Lesley_lc.BinaryTree;

public class ex112 {
    /**
     * Definition for a binary tree node.
     */
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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            if (targetSum == root.val) {
                return true;
            } else {
                return false;
            }
        }

        int newSum = targetSum - root.val;

        if (root.left != null && root.right != null) {
            return hasPathSum(root.left, newSum) || hasPathSum(root.right, newSum);
        }
        if (root.left != null) {
            return hasPathSum(root.left, newSum);
        }
        if (root.right != null) {
            return hasPathSum(root.right, newSum);
        }
        return false;
    }

}
