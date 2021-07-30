package com.flank.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * CountDownLatch阻塞多个线程
 *
 * @author flank
 * @date 2021/6/2 9:56
 */
public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    countDownLatch.await();
                    System.out.println(Thread.currentThread().getName() + ":开始执行了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "thread-" + i).start();
        }
        TimeUnit.SECONDS.sleep(1);
        countDownLatch.countDown();
        countDownLatch.countDown();
    }
}
