package com.flank.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author flank
 * @date 2021/4/15 16:51
 */
public class BlockQueueTest {
    private static BlockingQueue<Integer> blockingQueue=new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        new Thread(()->{
            int i=0;
            while (true) {
                try {
                    blockingQueue.put(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // System.out.println(Thread.currentThread().getName()+": "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        },"product").start();
        new Thread(()->{
            while (true) {
                int take = 0;
                try {
                    take = blockingQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+": "+take);
            }
        },"consume1").start();
        new Thread(()->{
            while (true) {
                int take = 0;
                try {
                    take = blockingQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+": "+take);
            }
        },"consume2").start();
        new Thread(()->{
            while (true) {
                int take = 0;
                try {
                    take = blockingQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+": "+take);
            }
        },"consume3").start();

        
    }
    
}
