package com.Lesley_lc.LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

// 时间复杂度击败 10.18%
// 空间复杂度击败 16.78%

public class ex61 {
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

    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(-101);
        dummy.next = head;
        if (dummy.next == null)
            return null;
        Deque<ListNode> stack = new ArrayDeque<>();
        int sz = 0;
        ListNode cur = dummy;
        for (; cur.next != null; cur = cur.next) {
            stack.add(cur);
            sz++;
        }
        k = k % sz;
        if (k == 0) {
            return dummy.next;
        }

        cur.next = head; // connect the last element to the head

        for (int i = 0; i < k - 1; i++) {
            cur = stack.pollLast();
        }
        dummy.next = cur;
        cur = stack.pollLast();
        cur.next = null;

        return dummy.next;
    }

}
