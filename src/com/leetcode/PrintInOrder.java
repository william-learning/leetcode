package com.leetcode;

import java.util.concurrent.Semaphore;

// LeetCode #1114
// Print in Order
// Concurrency
public class PrintInOrder {

    private final Foo foo;

    PrintInOrder() {
        this.foo = new Foo();
    }

    public Foo getFoo() {
        return this.foo;
    }
}

class Foo {
    Semaphore run2;
    Semaphore run3;

    public Foo() {
        this.run2 = new Semaphore(0);
        this.run3 = new Semaphore(0);
    }

    public void first(final Runnable printFirst) {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        this.run2.release();
    }

    public void second(final Runnable printSecond) throws InterruptedException {
        this.run2.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        this.run3.release();
    }

    public void third(final Runnable printThird) throws InterruptedException {
        this.run3.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
