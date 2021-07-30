package com.flank.concurrent;

/**
 * 测试volatile能保证原子性
 * @author flank
 * @date 2021/3/30 14:55
 */
public class VolatileTest {
    private static volatile int tickets;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                tickets++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                tickets++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(tickets);
    }
}
