package com.leetcode;

// LeetCode 21
// Merge Two Sorted Lists
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode current = null;

        while (l1 != null || l2 != null) {

            if (head == null) {
                if (l1 != null && l2 == null) {
                    return l1;
                }

                if (l1 == null && l2 != null) {
                    return l2;
                }

                if (l1.val > l2.val) {
                    current = l2;
                    l2 = l2.next;
                } else {
                    current = l1;
                    l1 = l1.next;
                }
                head = current;
            } else {
                if (l1 != null && l2 == null) {
                    current.next = l1;
                    break;
                }

                if (l1 == null && l2 != null) {
                    current.next = l2;
                    break;
                }

                if (l1.val > l2.val) {
                    current.next = l2;
                    current = current.next;
                    l2 = l2.next;
                } else {
                    current.next = l1;
                    current = current.next;
                    l1 = l1.next;
                }
            }
        }

        return head;
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            String valString = String.valueOf(val);

            if (next == null) {
                return valString;
            } else {
                return valString + next.toString();
            }
        }
    }
}
