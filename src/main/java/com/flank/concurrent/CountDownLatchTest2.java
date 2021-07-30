package com.flank.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * CountDownLatch阻塞一个线程
 * @author flank
 * @date 2021/6/2 10:05
 */
public class CountDownLatchTest2 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"执行了");
                countDownLatch.countDown();
            },"thread-"+i).start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程也执行完了");
    }
}
