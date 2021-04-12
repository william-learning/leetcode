package com.leetcode;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {

    @Test
    public void test() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        AddTwoNumbers.ListNode l1 =
                new AddTwoNumbers.ListNode(2,
                        new AddTwoNumbers.ListNode(4,
                                new AddTwoNumbers.ListNode(3)));

        AddTwoNumbers.ListNode l2 =
                new AddTwoNumbers.ListNode(5,
                        new AddTwoNumbers.ListNode(6,
                                new AddTwoNumbers.ListNode(4)));

        AddTwoNumbers.ListNode expectedOutput =
                new AddTwoNumbers.ListNode(7,
                        new AddTwoNumbers.ListNode(0,
                                new AddTwoNumbers.ListNode(8)));

        assertEquals(addTwoNumbers.addTwoNumbers(l1, l2).toString(), expectedOutput.toString());
    }

    @Test
    public void testLong() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        AddTwoNumbers.ListNode l1 =
                new AddTwoNumbers.ListNode(9,
                        new AddTwoNumbers.ListNode(9,
                                new AddTwoNumbers.ListNode(9,
                                        new AddTwoNumbers.ListNode(9,
                                                new AddTwoNumbers.ListNode(9,
                                                        new AddTwoNumbers.ListNode(9,
                                                                new AddTwoNumbers.ListNode(9)))))));

        AddTwoNumbers.ListNode l2 =
                new AddTwoNumbers.ListNode(9,
                        new AddTwoNumbers.ListNode(9,
                                new AddTwoNumbers.ListNode(9,
                                        new AddTwoNumbers.ListNode(9))));

        AddTwoNumbers.ListNode expectedOutput =
                new AddTwoNumbers.ListNode(8,
                        new AddTwoNumbers.ListNode(9,
                                new AddTwoNumbers.ListNode(9,
                                        new AddTwoNumbers.ListNode(9,
                                                new AddTwoNumbers.ListNode(0,
                                                        new AddTwoNumbers.ListNode(0,
                                                                new AddTwoNumbers.ListNode(0,
                                                                        new AddTwoNumbers.ListNode(1))))))));


        assertEquals(addTwoNumbers.addTwoNumbers(l1, l2).toString(), expectedOutput.toString());
    }
}