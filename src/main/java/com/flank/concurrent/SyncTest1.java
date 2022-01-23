package com.flank.concurrent;

/**
 * synchronized修饰实例方法
 *
 * @author flank
 * @date 2021/3/30 9:51
 */
public class SyncTest1 implements Runnable {
    //共享变量
    private static int i;

    public synchronized void increase() {
        i++;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SyncTest1 syncTest1 = new SyncTest1();

        //两个线程持有同一把对象锁
        Thread thread = new Thread(syncTest1);
        Thread thread2 = new Thread(syncTest1);

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();
        System.out.println(i);
    }


}
