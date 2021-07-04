package com.leetcode;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void test() {
        final LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();

        assertEquals(lswrc.lengthOfLongestSubstring("abcabcbb"), 3);
        assertEquals(lswrc.lengthOfLongestSubstring("bbbbb"), 1);
        assertEquals(lswrc.lengthOfLongestSubstring("pwwkew"), 3);
        assertEquals(lswrc.lengthOfLongestSubstring(""), 0);
        assertEquals(lswrc.lengthOfLongestSubstring("dvdf"), 3);
        assertEquals(lswrc.lengthOfLongestSubstring("a"), 1);
        assertEquals(lswrc.lengthOfLongestSubstring("ckilbkd"), 5);
        assertEquals(lswrc.lengthOfLongestSubstring("ttmxubssvjkxcht"), 8);
    }

    @Test
    public void testBeforeRefactoring() {
        final LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();

        assertEquals(lswrc.lengthOfLongestSubstringBeforeRefactoring("abcabcbb"), 3);
        assertEquals(lswrc.lengthOfLongestSubstringBeforeRefactoring("bbbbb"), 1);
        assertEquals(lswrc.lengthOfLongestSubstringBeforeRefactoring("pwwkew"), 3);
        assertEquals(lswrc.lengthOfLongestSubstringBeforeRefactoring(""), 0);
        assertEquals(lswrc.lengthOfLongestSubstringBeforeRefactoring("dvdf"), 3);
        assertEquals(lswrc.lengthOfLongestSubstringBeforeRefactoring("a"), 1);
        assertEquals(lswrc.lengthOfLongestSubstringBeforeRefactoring("ckilbkd"), 5);
        assertEquals(lswrc.lengthOfLongestSubstringBeforeRefactoring("ttmxubssvjkxcht"), 8);
    }
}