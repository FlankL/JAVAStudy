package com.flank.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author flank
 * @date 2021/4/13 16:42
 */
public class DemonTest {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(2);
        int i = atomicInteger.incrementAndGet();
        System.out.println(i);
    }
}
