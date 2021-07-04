package com.leetcode;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void test1() {
        final LongestCommonPrefix lcp = new LongestCommonPrefix();
        final String[] strings = {"flower","flow","flight"};

        assertEquals(lcp.longestCommonPrefix(strings), "fl");
    }

    @Test
    public void test2() {
        final LongestCommonPrefix lcp = new LongestCommonPrefix();
        final String[] strings = {"dog","racecar","car"};

        assertEquals(lcp.longestCommonPrefix(strings), "");
    }

    @Test
    public void test3() {
        final LongestCommonPrefix lcp = new LongestCommonPrefix();
        final String[] strings = {"","empty","string"};

        assertEquals(lcp.longestCommonPrefix(strings), "");
    }

    @Test
    public void test4() {
        final LongestCommonPrefix lcp = new LongestCommonPrefix();
        final String[] strings = {"a","ab","abc"};

        assertEquals(lcp.longestCommonPrefix(strings), "a");
    }
}