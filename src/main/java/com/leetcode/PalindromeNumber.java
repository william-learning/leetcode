package com.leetcode;

// LeetCode #9
public class PalindromeNumber {

    private static final int INT_MAX = Integer.MAX_VALUE;

    public boolean isPalindrome(int x) {

        // Edge case: If number is negative, it is not a palindrome
        if (x < 0) {
            return false;
        }

        // Reverse the integer if not negative
        int num = x;
        int reverse = 0;
        int current;
        while (num != 0) {
            current = num % 10;

            // Edge case: Reverse of int is larger than 2147483647
            // Not accounting for negative numbers
            if (reverse > INT_MAX/10) {
                return false;
            }

            reverse = reverse * 10 + current;
            num /= 10;
        }

        // An integer is a palindrome when it reads the same backward as forward
        return reverse == x;
    }
}
