package com.leetcode;

// LeetCode #14
// Longest Common Prefix
public class LongestCommonPrefix {

    public String longestCommonPrefix(final String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        int count = 0;
        while (count < strs.length) {
            while (!strs[count].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
            count++;
        }
        return prefix;
    }

    public String longestCommonPrefixBeforeRefactoring(final String[] strs) {
        final int MAX_LENGTH = 200;
        final char[][] strChars = new char[MAX_LENGTH][MAX_LENGTH];
        final char[] longestCommonPrefix = new char[MAX_LENGTH];
        char currentChar;
        int shortestStrLen = MAX_LENGTH;
        int strLen = 0;
        final int numberOfStrings = strs.length;

        for (int i = 0; i < numberOfStrings; i++) {
            strLen = strs[i].length();
            if (strLen == 0) return "";
            shortestStrLen = (strLen < shortestStrLen) ? strLen : shortestStrLen;

            strChars[i] = strs[i].toCharArray();
        }

        for (int i = 0; i < shortestStrLen; i++) {
            currentChar = strChars[0][i];
            for (int j = 0; j < numberOfStrings; j++) {
                if (currentChar != strChars[j][i]) {
                    return charToStr(longestCommonPrefix);
                }
            }
            longestCommonPrefix[i] = currentChar;
        }

        return charToStr(longestCommonPrefix);
    }

    private String charToStr(final char[] chars) {
        return String.valueOf(chars).replace("\u0000", "");
    }
}
