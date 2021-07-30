package com.flank.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicInteger使用测试
 *
 * @author flank
 * @date 2021/4/14 8:53
 */
public class AtoicIntegerTest {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(2);

        //1.相加并返回
        int i = atomicInteger.addAndGet(3);
        System.out.println("i = " + i);

        //2.如果输入值==预期值，则以原子方式将该值设置为输入的值。
        boolean b = atomicInteger.compareAndSet(5, 6);
        System.out.println("b:" + b + " atomicInteger：" + atomicInteger);//6

        //3.以原子的方式将当前值+1，返回的是加之前的值,相当于i++,先赋值，再加1，返回的是加之前的值
        atomicInteger.getAndIncrement();

        //4.以原子的方式将当前值+1，返回的是加之后的值，相当于++i。先加1，再赋值，返回的是加之后的值。
        int i1 = atomicInteger.incrementAndGet();
        System.out.println(i1);
        System.out.println(atomicInteger);

        //5.以原子方式设置新值，并返回旧值。
        int old = atomicInteger.getAndSet(12);
        System.out.println("新值：" + atomicInteger);
        System.out.println("旧值：" + old);

    }
}
