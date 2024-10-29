package com.Lesley_lc.LinkedList;

// 19. Remove Nth Node From End of List

public class ex19 {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null)
            return null;

        ListNode dummy = new ListNode();
        dummy.next = head;

        int sz = 0;
        ListNode cur = dummy;
        while (cur.next != null) {
            sz++;
            cur = cur.next;
        } // now cur is the last node

        int target = sz - n;
        cur = dummy;
        for (int i = 0; i < target; i++) {
            cur = cur.next;
        }
        cur.next = (cur.next != null) ? cur.next.next : null;

        return dummy.next;
    }
}
