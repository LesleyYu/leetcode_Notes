package com.Lesley_lc.LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

// 时间和空间复杂度都太高了！！

public class ex86 {

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

        ListNode dummy = new ListNode(-101);
        dummy.next = head;

        Deque<ListNode> greaterNodes = new ArrayDeque<>();
        ListNode cur = dummy;
        for (; cur != null; cur = cur.next) {
            ListNode check = cur.next != null ? cur.next : null;
            // if (check != null) {
            for (; check != null && check.val >= x; check = check.next) {
                greaterNodes.add(check);
                cur.next = check.next != null ? check.next : null; //
            }
            // }
            if (cur.next == null)
                break;
        }

        for (; !greaterNodes.isEmpty(); cur = cur.next) {
            cur.next = greaterNodes.pollFirst();
        }

        cur.next = null;

        return dummy.next;
    }

}
