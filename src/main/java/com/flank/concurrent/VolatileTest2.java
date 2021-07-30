package com.flank.concurrent;

/**
 * 测试volatile的可见性
 * @author flank
 * @date 2021/3/30 15:20
 */
public class VolatileTest2 {
    private static volatile boolean  flag =false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            while (!flag) {

            }
            System.out.println("执行结束");
        }).start();

        Thread.sleep(2*1000);
        System.out.println("等待中。。。");
        flag=true;

    }
}
