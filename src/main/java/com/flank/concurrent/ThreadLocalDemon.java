package com.flank.concurrent;

/**
 * 测试使用ThreadLocal
 * @author flank
 * @date 2021/4/15 10:40
 */
public class ThreadLocalDemon {
    public static void main(String[] args) {
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        ThreadLocal<Integer> threadLocal2 = new ThreadLocal<>();
        threadLocal2.set(5);
        threadLocal.set(2);
        threadLocal.set(3);
        // Integer a = threadLocal.get();
        // System.out.println("a = " + a);//3
        // Integer b = threadLocal.get();
        // System.out.println("b = " + b);//3
        //
        // threadLocal.remove();
        // System.out.println(threadLocal.get());

    }
}
