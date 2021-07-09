package com.leetcode;

import java.util.HashMap;
import java.util.Map;

// LeetCode #13
public class RomanToInteger {

    // Symbol       Value
    // I             1
    // V             5
    // X             10
    // L             50
    // C             100
    // D             500
    // M             1000

    final Map<Character, Integer> values = new HashMap<>();

    public int romanToInt(final String s) {
        int num = 0;

        // Split into character array
        // ArrayList<Character> is significantly slower than char[]
        // final ArrayList<Character> chars = new ArrayList<>(s.chars().mapToObj(c -> (char) c).collect(Collectors.toList()));
        // chars.forEach(c -> System.out.print(c));
        // System.out.println();

        final char[] chars = s.toCharArray();

        int currentLevel = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            final int charValue = this.symbolIntValue(chars[i]);
            if (charValue >= currentLevel) {
                num += charValue;
                currentLevel = charValue;
            } else {
                num -= charValue;
            }
        }

        return num;
    }

    private int symbolIntValue(final char c) {
        this.initialiseValuesMap();
        return this.values.get(c);
    }

    private void initialiseValuesMap() {
        if (this.values.isEmpty()) {
            this.values.put('I', 1);
            this.values.put('V', 5);
            this.values.put('X', 10);
            this.values.put('L', 50);
            this.values.put('C', 100);
            this.values.put('D', 500);
            this.values.put('M', 1000);
        }
    }
}
