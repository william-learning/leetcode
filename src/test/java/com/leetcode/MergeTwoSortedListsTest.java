package com.leetcode;

import com.leetcode.MergeTwoSortedLists.ListNode;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeTwoSortedListsTest {

    @Test
    public void test1() {
        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        assertEquals(
                mtsl.mergeTwoLists(listNode1, listNode2).toString(),
                "112344");
    }

    @Test
    public void test2() {
        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

        ListNode listNode1 = null;
        ListNode listNode2 = null;

        assertNull(mtsl.mergeTwoLists(listNode1, listNode2));
    }

    @Test
    public void test3() {
        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

        ListNode listNode1 = null;
        ListNode listNode2 = new ListNode(0);

        assertEquals(
                mtsl.mergeTwoLists(listNode1, listNode2).toString(),
                "0");
    }
}