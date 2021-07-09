package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {
    RomanToInteger rti = new RomanToInteger();

    @Test
    void tests() {
        assertEquals(rti.romanToInt("III"), 3);
        assertEquals(rti.romanToInt("IV"), 4);
        assertEquals(rti.romanToInt("IX"), 9);
        assertEquals(rti.romanToInt("LVIII"), 58);
        assertEquals(rti.romanToInt("MCMXCIV"), 1994);
    }

}