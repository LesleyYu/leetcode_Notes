package com.Lesley_lc.LinkedList;

public class ex2 {
    /**
     * Definition for singly-linked list.
     */
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

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode curNode = new ListNode((l1.val + l2.val) % 10);
            ListNode res = curNode;
            int curSum = (l1.val + l2.val) / 10;
            System.out.println("curSum = " + curSum);
            while (l1.next != null || l2.next != null || curSum != 0) {
                if (l1.next != null) {
                    l1 = l1.next;
                    curSum += l1.val;
                }
                if (l2.next != null) {
                    l2 = l2.next;
                    curSum += l2.val;
                }
                System.out.println("curSum = " + curSum);
                ListNode newNode = new ListNode();
                if (curSum <= 9) {
                    newNode.val = curSum;
                    curSum = 0;
                } else {
                    newNode.val = curSum % 10;
                    curSum = curSum / 10;
                }
                curNode.next = newNode;
                curNode = newNode;
            }

            return res;
        }

        public void main(String[] args) {
            ListNode head1 = new ListNode(5);
            ListNode head2 = new ListNode(9);
            System.out.println(addTwoNumbers(head1, head2));

        }
    }
}
