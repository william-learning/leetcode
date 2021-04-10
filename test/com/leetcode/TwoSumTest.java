package com.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum sum = new TwoSum();
        int[] input = {2, 7, 11, 15};
        int[] output = sum.twoSum(input, 9);
        int[] expected = {0, 1};

        assertArrayEquals(output, expected);
    }

    @Test
    public void testTwoSumBeforeRefactoring() {
        TwoSum sum = new TwoSum();
        int[] input = {2, 7, 11, 15};
        int[] output = sum.twoSumBeforeRefactoring(input, 9);
        int[] expected = {0, 1};

        assertArrayEquals(output, expected);
    }
}
