package com.Lesley_lc.BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class ex106 {

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

    private Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;

        // create hashMap to store index and value in the inorder list, so that we can
        // quickly locate the value.
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }

        return build(inorder, postorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int inorder_left, int inorder_right,
            int postorder_left, int postorder_right) {
        if (inorder_left > inorder_right) {
            return null;
        }
        int postorder_root = postorder_right; // root idx
        System.out.println("postorder_root index = " + postorder_root);
        System.out.println("postorder_root value = " + postorder[postorder_root]);
        int inorder_root = indexMap.get(postorder[postorder_right]); // root index
        System.out.println("inorder_root index = " + inorder_root);
        System.out.println("inorder_root value = " + inorder[inorder_root]);
        int right_subtree_length = inorder_right - inorder_root;

        TreeNode rootNode = new TreeNode(postorder[postorder_root]);
        rootNode.right = build(inorder, postorder, inorder_root + 1, inorder_right,
                postorder_right - right_subtree_length, postorder_right - 1);
        rootNode.left = build(inorder, postorder, inorder_left, inorder_root - 1,
                postorder_left, postorder_right - right_subtree_length - 1);

        return rootNode;
    }

}
