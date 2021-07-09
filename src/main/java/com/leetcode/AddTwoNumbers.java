package com.leetcode;

// LeetCode #2
public class AddTwoNumbers {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(final int val) { this.val = val; }
        ListNode(final int val, final ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            if (next != null) {
                return String.valueOf(val) + next.toString();
            } else {
                return String.valueOf(val);
            }
        }
    }

    public ListNode addTwoNumbers(final ListNode l1, final ListNode l2) {

        // Check if counter is less than or equals to 100
        // Check if carryForward is equal to 1
        ListNode returnListNode = new ListNode();
        ListNode nextNode = returnListNode;
        ListNode firstListNode = l1;
        ListNode secondListNode = l2;
        int intermediateVal = 0;
        int carryForward = 0;
        int counter = 1;
        while ((counter <= 100 && !(firstListNode == null && secondListNode == null)) || carryForward != 0) {

            // Reset carry forward after adding it to the intermediate value
            if (carryForward != 0) {
                intermediateVal++;
                carryForward = 0;
            }

            // Equal length
            // l1 is longer than l2
            // l2 is longer than l1
            if (firstListNode != null && secondListNode != null) {
                intermediateVal += firstListNode.val + secondListNode.val;
                firstListNode = firstListNode.next;
                secondListNode = secondListNode.next;
            } else if (firstListNode != null && secondListNode == null) {
                intermediateVal += firstListNode.val;
                firstListNode = firstListNode.next;
            } else if (firstListNode == null && secondListNode != null) {
                intermediateVal += secondListNode.val;
                secondListNode = secondListNode.next;
            }

            if (intermediateVal >= 10) {
                intermediateVal -= 10;
                carryForward = 1;
            }

            nextNode.next = new ListNode(intermediateVal);
            nextNode = nextNode.next;
            intermediateVal = 0;
            counter++;
        }
        return returnListNode.next;
    }
}
