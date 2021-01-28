package com.flank.threadpool.createthread;

/**
 * 通过继承Thread来创建线程
 * @author flank
 * @date 2020/12/4 10:48
 */
public class CreateThread1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" run");
    }
    public static void main(String[] args) {
        CreateThread1 createThread1 = new CreateThread1();
        createThread1.start();
        createThread1.run();

    }
}
