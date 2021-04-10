package com.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RunningSumOfOneDArrayTest {

    @Test
    public void test1() {
        final RunningSumOfOneDArray runningSumOfOneDArray = new RunningSumOfOneDArray();
        assertArrayEquals(runningSumOfOneDArray.runningSum(
                new int[] {1,2,3,4}),
                new int[] {1,3,6,10});
    }

    @Test
    public void test2() {
        final RunningSumOfOneDArray runningSumOfOneDArray = new RunningSumOfOneDArray();
        assertArrayEquals(runningSumOfOneDArray.runningSum(
                new int[] {1,1,1,1,1}),
                new int[] {1,2,3,4,5});
    }

    @Test
    public void test3() {
        final RunningSumOfOneDArray runningSumOfOneDArray = new RunningSumOfOneDArray();
        assertArrayEquals(runningSumOfOneDArray.runningSum(
                new int[] {3,1,2,10,1}),
                new int[] {3,4,6,16,17});
    }

    @Test
    public void testBeforeRefactoring1() {
        final RunningSumOfOneDArray runningSumOfOneDArray = new RunningSumOfOneDArray();
        assertArrayEquals(runningSumOfOneDArray.runningSumBeforeRefactoring(
                new int[] {1,2,3,4}),
                new int[] {1,3,6,10});
    }

    @Test
    public void testBeforeRefactoring2() {
        final RunningSumOfOneDArray runningSumOfOneDArray = new RunningSumOfOneDArray();
        assertArrayEquals(runningSumOfOneDArray.runningSumBeforeRefactoring(
                new int[] {1,1,1,1,1}),
                new int[] {1,2,3,4,5});
    }

    @Test
    public void testBeforeRefactoring3() {
        final RunningSumOfOneDArray runningSumOfOneDArray = new RunningSumOfOneDArray();
        assertArrayEquals(runningSumOfOneDArray.runningSumBeforeRefactoring(
                new int[] {3,1,2,10,1}),
                new int[] {3,4,6,16,17});
    }
}