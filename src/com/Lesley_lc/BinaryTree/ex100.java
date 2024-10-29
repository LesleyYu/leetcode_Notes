package com.Lesley_lc.BinaryTree;

// 104. Maximum Depth of Binary Tree

public class ex100 {

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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null) {
            if (q != null) {
                return false;
            } else {
                return true;
            }
        } else {
            if (q == null) {
                return false;
            } else {
                if (p.val == q.val) {

                    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
                } else {
                    return false;
                }
            }
        }
    }

}
