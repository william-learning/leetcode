package com.leetcode;

import java.util.*;

// LeetCode #17
// 20210408 Challenge
public class LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(final String digits) {

        final Map<Character, List<String>> map = new HashMap<>();
        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));

        final char[] digitsArray= digits.toCharArray();
        final int digitsArrayLength = digitsArray.length;

        if (digitsArrayLength == 0) {
            return new ArrayList<>();
        } else if (digitsArrayLength == 1) {
            return map.get(digitsArray[0]);
        } else {
            final String remainingDigits = digits.substring(1);
            final List<String> input = this.letterCombinations(remainingDigits);

            final List<String> output = new ArrayList<>();
            for (String insert : map.get(digitsArray[0])) {
                for (String str : input) {
                    output.add(insert + str);
                }
            }
            return new ArrayList<>(output);
        }
    }
}
