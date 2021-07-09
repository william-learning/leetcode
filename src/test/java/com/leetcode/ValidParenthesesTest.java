package com.leetcode;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidParenthesesTest {

    @Test
    public void test() {
        String s;
        ValidParentheses vp = new ValidParentheses();

        s = "()";
        assertEquals(vp.isValid(s), true);
        s = "()[]{}";
        assertEquals(vp.isValid(s), true);
        s = "(]";
        assertEquals(vp.isValid(s), false);
        s = "([)]";
        assertEquals(vp.isValid(s), false);
        s = "{[]}";
        assertEquals(vp.isValid(s), true);

    }
}