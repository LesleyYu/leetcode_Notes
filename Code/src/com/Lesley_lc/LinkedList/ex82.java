package com.Lesley_lc.LinkedList;

// 82. Remove Duplicates from Sorted List II

public class ex82 {
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

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-101);
        dummy.next = head;

        int cnt = 0, val = -199;

        for (ListNode cur = dummy; cur.next != null;) {
            ListNode left = cur.next;
            val = left.val;
            ListNode right = left.next != null ? left.next : null;
            if (right == null)
                break;
            if (val == right.val)
                cnt++;
            while (right != null && val == right.val) {
                cnt++;
                right = right.next != null ? right.next : null;
            }
            for (int i = 1; i <= cnt; i++) {
                cur.next = cur.next.next;
            }
            if (cnt == 0) {
                cur = cur.next;
            }
            cnt = 0;
        }

        return dummy.next;
    }

}
