package com.flank.concurrent;


import java.util.ArrayList;
import java.util.List;

/**
 * 使用synchronized实现生产者和消费者
 *
 * @author flank
 * @date 2021/4/9 9:38
 */
class Buffer {

    private List<Integer> buffer = new ArrayList<>();

    public synchronized void product() {
        while (buffer.size()==0) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ":生产了  " + i);
                buffer.add(i);
            }
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
    }

    public synchronized void consume() {
        while (buffer.size() > 0) {
            for (int i = 0; i < buffer.size(); i++) {
                System.out.println(Thread.currentThread().getName() + ":消费了  " + buffer.get(i));
            }
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer.clear();
        this.notifyAll();

    }
}

public class LockTest1 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread writeThread = new Thread(() -> {
            while (true) {
                buffer.product();
            }
        });

        Thread readThread = new Thread(() -> {
            while (true) {
                buffer.consume();
            }
        });

        readThread.start();
        writeThread.start();
    }
}
