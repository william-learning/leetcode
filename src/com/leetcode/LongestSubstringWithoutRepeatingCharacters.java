package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

// LeetCode #3
// Longest Substring Without Repeating Characters
public class LongestSubstringWithoutRepeatingCharacters {

    // Use sliding window approach
    public int lengthOfLongestSubstring(final String s) {
        if (s.length() == 0) return 0;

        final char[] chars = s.toCharArray();
        final LinkedList substring = new LinkedList();
        int left = 0;
        int currentLength = 0;
        int longestLength = 0;
        for (int right = 0; right < chars.length; right++) {
            while (substring.contains(chars[right])) {
                // Reset if substring has repeating characters
                substring.removeFirst();
                left++;
            }
            substring.add(chars[right]);
            currentLength = right - left + 1;
            longestLength = (currentLength > longestLength) ? currentLength : longestLength;
        }

        return longestLength;
    }

    public int lengthOfLongestSubstringBeforeRefactoring(final String s) {
        if (s.length() == 0) return 0;

        final char[] c = s.toCharArray();
        final Set uniqueCharacters = new HashSet(Arrays.asList(c[0]));
        int left = 0;
        int currentLength = 1;
        int longestLength = 1;
        for (int right = 1; right < c.length; right++) {
            while (uniqueCharacters.contains(c[right])) {
                // Reset if substring has repeating characters
                uniqueCharacters.remove(c[left]);
                left++;
            }
            uniqueCharacters.add(c[right]);
            currentLength = right - left + 1;
            longestLength = (currentLength > longestLength) ? currentLength : longestLength;
        }

        return longestLength;
    }
}
