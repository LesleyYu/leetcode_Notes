package com.Lesley_lc.LinkedList;

// 快慢指针

public class ex61_2 {

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

        // Deque<ListNode> stack = new ArrayDeque<>();
        int sz = 0;
        for (ListNode cur = dummy; cur.next != null; cur = cur.next) {
            // stack.add(cur);
            sz++;
        }
        k = k % sz;
        if (k == 0) {
            return dummy.next;
        }

        ListNode fast = dummy;
        // fast and slow pointers
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        ListNode slow = dummy;
        for (; fast.next != null; fast = fast.next) {
            slow = slow.next;
        }
        dummy.next = slow.next;
        slow.next = null;
        fast.next = head;

        return dummy.next;
    }

}
