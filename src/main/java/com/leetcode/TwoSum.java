package com.leetcode;

import java.util.HashMap;

// LeetCode #1
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<> ();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // Before refactoring
    public int[] twoSumBeforeRefactoring(int[] nums, int target) {
        HashMap hashmap = new HashMap();
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashmap.get(complement) == null) {
                hashmap.put(nums[i], i);
            } else {
                answer[0] = (int) hashmap.get(complement);
                answer[1] = i;
            }
        }
        return answer;
    }
}
