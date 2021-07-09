package com.leetcode;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void test() {
        ReverseInteger reverseInteger = new ReverseInteger();

        assertEquals(reverseInteger.reverse(123), 321);
        assertEquals(reverseInteger.reverse(-123), -321);
        assertEquals(reverseInteger.reverse(120), 21);
        assertEquals(reverseInteger.reverse(0), 0);

        // Edge cases
        assertEquals(reverseInteger.reverse(1534236469), 0);
        assertEquals(reverseInteger.reverse(-1534236469), 0);
    }

}