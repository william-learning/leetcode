package com.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {

    private static final RemoveDuplicatesFromSortedArray rdfsa = new RemoveDuplicatesFromSortedArray();

    @Test
    public void test1() {
        final int[] nums = {1,1,2}; // Input array
        final int[] expectedNums = {1,2}; // The expected answer with correct length

        assertDuplicatesRemoved(nums, expectedNums);
    }

    @Test
    public void test2() {
        final int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
        final int[] expectedNums = {0,1,2,3,4}; // The expected answer with correct length

        assertDuplicatesRemoved(nums, expectedNums);
    }

    private void assertDuplicatesRemoved(final int[] nums, final int[] expectedNums) {
        final int k = this.rdfsa.removeDuplicates(nums); // Calls your implementation

        assertEquals(k, expectedNums.length);
        for (int i = 0; i < k; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }
}