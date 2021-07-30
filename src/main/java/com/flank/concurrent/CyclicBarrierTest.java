package com.flank.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author flank
 * @date 2021/6/2 11:09
 */
public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                try {
                    System.out.println(Thread.currentThread().getName()+": 到了A");
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread().getName()+": 过了A，到达B");
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread().getName()+": 过了B");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            },"thread-"+i).start();
        }

    }
}
