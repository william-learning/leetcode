package com.leetcode;

import java.util.LinkedList;

// LeetCode #20
// Valid Parentheses
public class ValidParentheses {

    public boolean isValid(final String s) {
        final char[] chars = s.toCharArray();
        final LinkedList<Character> list = new LinkedList<>();

        // Should return not valid if empty
        if (chars.length == 0) return false;

        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];
            if (list.size() == 0) {
                list.push(current);
            } else if (isAdjacent(list.peekFirst(), current)) {
                list.pop();
            } else {
                list.push(current);
            }
        }

        return list.size() == 0;
    }

    private boolean isAdjacent(final Character last, final Character current) {
        if (last == '(' && current == ')') {
            return true;
        } else if (last == '[' && current == ']') {
            return true;
        } else if (last == '{' && current == '}') {
            return true;
        } else {
            return false;
        }
    }
}
