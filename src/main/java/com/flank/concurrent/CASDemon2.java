package com.flank.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 重现ABA问题
 * @author flank
 * @date 2021/4/13 10:24
 */
public class CASDemon2 {
    //创建vlaue的初始值为4
    private static AtomicInteger value = new AtomicInteger(4);

    public static void main(String[] args) {
        new Thread(()->{
            //使用CAS将值修改成5
            boolean b = value.compareAndSet(4,5);
            System.out.println(Thread.currentThread().getName()+":"+value);

            //休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //使用CAS将值修改成4
            boolean b1 = value.compareAndSet(5, 4);
            System.out.println(Thread.currentThread().getName()+":"+value);
        },"Thread_A").start();

        new Thread(()->{
            //模拟线程执行比较慢
            try {
                //让线程停5秒，让他感知不到A线程对value的修改
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean b = value.compareAndSet(4, 10);
            System.out.println(Thread.currentThread().getName()+":"+value);
        },"Thread_B").start();

        //等待两个线程执行完输出最终的值
        //为什么是2,因为一个main线程，一个后台的GC线程
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        //或者使用join也可以。
        System.out.println("value:"+value);


    }
}
