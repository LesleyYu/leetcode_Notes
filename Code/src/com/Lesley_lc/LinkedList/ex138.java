package com.Lesley_lc.LinkedList;

// 该方法会修改原链表的 next pointer
// 不可用

public class ex138 {
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
        Node prev = new Node(-9999);

        Node curNode = new Node(0);
        prev.next = curNode;
        prev.random = head;
        Node temp = head; // used to loop through the original list
        while (temp != null) {
            Node newNode = new Node(0);
            curNode.next = newNode;
            head = temp;
            curNode.val = head.val;
            curNode.random = head;
            System.out.println("curNode.random: " + curNode.random);
            temp = head.next;
            head.next = curNode;
            curNode = newNode;
        }

        // loop2: assign random node and delete pointers;
        curNode = prev.next;
        while (curNode != null) {
            if (curNode.random != null) {
                temp = curNode.random.next;
                curNode.random = temp;
            }
            curNode = curNode.next;
        }

        return prev.next;
    }
}
