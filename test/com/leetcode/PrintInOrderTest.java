package com.leetcode;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.awaitility.Awaitility.await;
import static org.junit.Assert.assertEquals;

public class PrintInOrderTest {

    Runnable printFirst = new Thread(() -> System.out.print("first"));
    Runnable printSecond = new Thread(() -> System.out.print("second"));
    Runnable printThird = new Thread(() -> System.out.print("third"));

    @Test
    public void test1() {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        final Foo foo = new PrintInOrder().getFoo();

        startFirst(foo);
        startSecond(foo);
        startThird(foo);

        await().untilAsserted(() -> assertEquals(baos.toString().length(), 16));

        assertEquals(baos.toString(), "firstsecondthird");
    }

    @Test
    public void test2() {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        final Foo foo = new PrintInOrder().getFoo();

        startFirst(foo);
        startSecond(foo);
        startThird(foo);

        await().untilAsserted(() -> assertEquals(baos.toString().length(), 16));

        assertEquals(baos.toString(), "firstsecondthird");
    }

    private void startFirst(final Foo foo) {
        new Thread(() -> foo.first(this.printFirst)).start();
    }

    private void startSecond(final Foo foo) {
        new Thread(() -> {
            try {
                foo.second(this.printSecond);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private void startThird(final Foo foo) {
        new Thread(() -> {
            try {
                foo.third(this.printThird);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}