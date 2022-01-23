package com.flank.concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author flank
 * @date 2021/6/1 20:35
 */
public class SemaphoreTest {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < 12; i++) {
            new Thread(() -> {
                try {
                    //所有线程使用同一个信号量
                    semaphore.acquire(2);
                    System.out.println(Thread.currentThread().getName() + "可以开始打饭");
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println(Thread.currentThread().getName() + "打完了饭");
                    semaphore.release(2);
                }
            }, "thread-" + i).start();

        }

    }
}
