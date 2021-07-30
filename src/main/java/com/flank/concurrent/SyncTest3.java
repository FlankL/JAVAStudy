package com.flank.concurrent;

/**
 * synchronized修饰静态方法，此时对象锁是类对象
 *
 * @author flank
 * @date 2021/3/30 9:51
 */
public class SyncTest3 implements Runnable {
    //共享变量
    private static int i;

    public synchronized static void increase() {
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
        SyncTest3 syncTest1 = new SyncTest3();
        SyncTest3 syncTest2 = new SyncTest3();

        //两个线程持有两把锁
        Thread thread = new Thread(syncTest1);
        Thread thread2 = new Thread(syncTest2);

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();
        System.out.println(i);
    }


}
