package com.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class LetterCombinationsOfAPhoneNumberTest {

    @Test
    public void testDouble() {
        final LetterCombinationsOfAPhoneNumber combinations = new LetterCombinationsOfAPhoneNumber();
        assertEquals(combinations.letterCombinations("23"), Arrays.asList(
                "ad","ae","af","bd","be","bf","cd","ce","cf"
        ));
    }

    @Test
    public void testEmpty() {
        final LetterCombinationsOfAPhoneNumber combinations = new LetterCombinationsOfAPhoneNumber();
        assertEquals(combinations.letterCombinations(""), Collections.emptyList());
    }

    @Test
    public void testSingle() {
        final LetterCombinationsOfAPhoneNumber combinations = new LetterCombinationsOfAPhoneNumber();
        assertEquals(combinations.letterCombinations("2"), Arrays.asList(
                "a","b","c"
        ));
    }
}