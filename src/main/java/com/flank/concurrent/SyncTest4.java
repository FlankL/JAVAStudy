package com.flank.concurrent;

/**
 * 测试使用同步代码块
 *
 * @author flank
 * @date 2021/3/30 10:36
 */
public class SyncTest4 {
    //创建两个共享变量
    private static int a;

    //创建两个对象锁
    private Object object1;
    private Object object2;

    public SyncTest4(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }


    public void increase1() {
        synchronized (object1) {
            a++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void increase2() {
        synchronized (object2) {
            a++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        //创建一个锁对象
        Object o1 = new Object();
        Object o2 = new Object();
        //increase1()和increase2()使用两把锁，所以两个方法没有互斥，调用两个方法的线程也没有互斥,会有线程安全问题
        // SyncTest4 syncTest4 = new SyncTest4(o1, o2);

        //increase1()和increase2()使用一把锁，所以两个方法有互斥，调用两个方法的线程也有互斥,不会有线程安全问题
        SyncTest4 syncTest4 = new SyncTest4(o1, o1);

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                syncTest4.increase1();
            }
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                syncTest4.increase2();
            }
        });

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println(a);

    }


}
