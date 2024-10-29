package com.Lesley_lc.LinkedList;

// create dummy node before head
// 非常重要！！！！！！！

public class ex92 {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        // // if no need for change
        // if (left == right)
        // return head;

        // return head;

        // My try:
        // if no need for change
        if (left == right)
            return head;

        // create dummy node before head
        // 非常重要！！！！！！！
        ListNode dummy = new ListNode(-99);
        dummy.next = head;

        // loop to the previous node of the left node
        ListNode pre = dummy;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        ListNode L = pre.next; // the left node
        // will be connected to (1 node after thr right node)

        // loop from the left node to the right node
        ListNode before = L; // the node before `node`
        ListNode cur = L.next;
        for (int i = left + 1; i <= right; i++) {
            // System.out.println("cur.val = " + cur.val);
            ListNode next = (cur.next != null) ? cur.next : null; // null
            cur.next = before; // 4.next = 3
            before = cur; // before = 4
            cur = (next != null) ? next : null; // node = null
        }
        // now before = 4, that is the right node
        // now cur = 5, that is the node after the right node
        pre.next = before; // connect to the right node
        L.next = (cur != null) ? cur : null; // connect to (1 node after thr right
                                             // node)

        return dummy.next;
    }
}
