package com.flank.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author flank
 * @date 2021/7/25 10:46
 */
public class BlockQueueTest2 {
    private static BlockingQueue<Integer> queue=new LinkedBlockingQueue<>();
    public static void main(String[] args) {
        new Thread(() -> {
            int i=0;
            while (true) {
                try {
                    queue.put(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        
    }
}
