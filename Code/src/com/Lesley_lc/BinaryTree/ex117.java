package com.Lesley_lc.BinaryTree;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class ex117 {

    // Definition for a Node.
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {
        if (root == null)
            return null;

        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        while (queue.peek() != null) {
            int n = queue.size();
            Node last = null;
            for (int i = 0; i < n; i++) {
                Node cur = queue.poll();
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
                if (i != 0) {
                    last.next = cur;
                }
                last = cur;
            }
        }

        return root;
    }

}
