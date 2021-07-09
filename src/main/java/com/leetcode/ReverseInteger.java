package com.leetcode;

// Leetcode #7
public class ReverseInteger {

    private static final int INT_MIN = Integer.MIN_VALUE;
    private static final int INT_MAX = Integer.MAX_VALUE;

    public int reverse(int x) {

        int reverse = 0;
        while (x != 0) {
            int current = x % 10;

            // Edge cases: reverse is less than -2147483648 or more than 2147483647
            if (reverse > INT_MAX/10 || reverse < INT_MIN/10) {
                return 0;
            }

            reverse = reverse * 10 + current;
            x /= 10;
        }

        return reverse;
    }
}
