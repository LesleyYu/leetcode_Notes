package com.Lesley_lc.LinkedList;

// 21. Merge Two Sorted Lists

// 第一次完全想偏了，在纠结 head node！ 
// 而且用了一个新链表，很多余，直接在原来的表上操作就好了（方法：迭代）
// 另一个方法：递归

//  Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }

// Method 1 : 迭代

public class ex21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 用一个prev node可以很好地处理 null case
        ListNode prev = new ListNode(-101);
        ListNode ans = prev;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                prev.next = list1;
                prev = prev.next;
                list1 = list1.next;
            } else {
                prev.next = list2;
                prev = prev.next;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            prev.next = list1;
        } else {
            prev.next = list2;
        }

        return ans.next;
    }

    public static void main(String[] args) {

    }
}
