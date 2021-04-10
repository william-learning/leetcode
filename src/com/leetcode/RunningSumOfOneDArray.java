package com.leetcode;

// LeetCode #1480
public class RunningSumOfOneDArray {

    public int[] runningSum(final int[] nums) {
        final int length = nums.length;

        for (int i = 1; i < length; i++) {
            nums[i] = nums[i-1] + nums[i];
        }

        return nums;
    }

    // Before Refactoring
    public int[] runningSumBeforeRefactoring(final int[] nums) {
        final int length = nums.length;
        final int[] output = new int[length];

        // Assume that nums.length >= 1
        output [0] = nums[0];
        for (int i = 1; i < length; i++) {
            output[i] = output[i-1] + nums[i];
        }

        return output;
    }
}
