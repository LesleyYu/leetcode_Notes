package com.Lesley_lc.LinkedList;

public class ex138_2 {
    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        // create new list of nodes
        for (Node node = head; node != null; node = node.next.next) {
            Node newNode = new Node(node.val);
            newNode.next = node.next;
            node.next = newNode;
        }
        // assign random nodes to new list of nodes
        for (Node node = head; node != null; node = node.next.next) {
            Node newNode = node.next;
            newNode.random = (node.random != null) ? node.random.next : null;
        }
        // split the two lists
        Node ans = head.next;
        for (Node node = head; node != null; node = node.next) { // 第三个循环条件容易错！
            Node newNode = node.next;
            node.next = node.next.next;
            newNode.next = newNode.next != null ? newNode.next.next : null;
        }
        return ans;
    }
}
