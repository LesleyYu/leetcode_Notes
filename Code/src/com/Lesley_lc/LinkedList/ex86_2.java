package com.Lesley_lc.LinkedList;

public class ex86_2 {

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

    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(-101);
        ListNode smallHead = small;
        ListNode large = new ListNode(-101);
        ListNode largeHead = large;

        for (ListNode cur = head; cur != null; cur = cur.next) {
            if (cur.val <= x) {
                small.next = cur;
                small = small.next;
            } else {
                large.next = cur;
                large = large.next;
            }
        }
        large.next = null;
        small.next = largeHead.next;

        return smallHead.next;
    }

}
