package com.Lesley_lc.LinkedList;

import java.util.HashSet;
import java.util.Set;

// 141. Linked List Cycle

// Method 1
// Use hashtable to store nodes being visited

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class ex141 {
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();

        while (head.next != null) {
            if (!visited.add(head)) {
                return true;
            }
            visited.add(head);
        }

        return false;
    }

    public static void main(String[] args) {
        // 没法测试
    }
}
