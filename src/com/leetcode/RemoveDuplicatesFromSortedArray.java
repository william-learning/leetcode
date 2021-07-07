package com.leetcode;

// LeetCode #26
// Remove Duplicates from Sorted Array
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int counter = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[counter]) {
                nums[++counter] = nums[i];
            }
        }

        // Length is counter + 1
        return counter + 1;
    }
}
