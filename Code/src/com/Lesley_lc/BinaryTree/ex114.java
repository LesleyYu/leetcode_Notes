package com.Lesley_lc.BinaryTree;

public class ex114 {
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

    public void flatten(TreeNode root) {
        if (root != null)
            putToRight(root);
    }

    private TreeNode putToRight(TreeNode root) {
        if (root.left != null) {
            if (root.right != null) {
                root.left = putToRight(root.left);
                root.right = putToRight(root.right);
                TreeNode temp = root.right;
                root.right = root.left;
                root.left = null;
                TreeNode cur = root.right;
                while (cur.right != null) {
                    cur = cur.right;
                }
                cur.right = temp;
            } else {
                root.right = root.left;
                root.left = null;
                putToRight(root.right);
            }
        } else {
            if (root.right != null) {
                putToRight(root.right);
            }
        }
        return root;
    }
}
