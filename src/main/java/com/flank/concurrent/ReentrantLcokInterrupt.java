package com.flank.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author flank
 * @date 2021/4/12 21:24
 */
public class ReentrantLcokInterrupt {
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        ReentrantLcokInterrupt demo1 = new ReentrantLcokInterrupt();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    demo1.test(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        Thread.sleep(500); // 等待0.5秒，让thread1先执行

        thread2.start();
        Thread.sleep(2000); // 两秒后，中断thread2

        thread2.interrupt();
    }

    public void test(Thread thread) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "， 想获取锁");
        lock.lockInterruptibly();   //注意，如果需要正确中断等待锁的线程，必须将获取锁放在外面，然后将InterruptedException抛出
        try {
            System.out.println(thread.getName() + "得到了锁");
            Thread.sleep(10000); // 抢到锁，10秒不释放
        } finally {
            System.out.println(Thread.currentThread().getName() + "执行finally");
            lock.unlock();
            System.out.println(thread.getName() + "释放了锁");
        }
    }
}
