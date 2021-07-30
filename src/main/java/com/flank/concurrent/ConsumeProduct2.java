package com.flank.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者和消费者实现方式二：
 * 1.使用JUC下面的Concurrent包下面的，ReentrantLock锁来实现
 * 2.使用await(),siganl(),signalAll()方法来替换wait()，notify(),notifyAll();
 *
 * @author flank
 * @date 2021/4/9 15:18
 */
public class ConsumeProduct2 {
    public static void main(String[] args) {
        Buffer2 buffer2 = new Buffer2();

        new Thread(() -> {
            while (true) {
                buffer2.product();
            }
        }, "product").start();

        new Thread(() -> {
            while (true) {
                buffer2.consume();
            }
        }, "consume").start();
    }

}

class Buffer2 {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private List<Integer> buffer = new ArrayList<>();

    public void product() {
        lock.lock();
        try {
            while (!buffer.isEmpty()) {
                condition.await();
                System.out.println("buffer is full");
            }
            for (int i = 0; i < 10; i++) {
                buffer.add(i);
            }
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void consume() {
        lock.lock();
        try {
            while (buffer.isEmpty()) {
                condition.await();
                System.out.println("buffer is empty");
            }
            for (int i = 0; i < buffer.size(); i++) {
                System.out.println("consumer: " + i);
            }
            buffer.clear();
            condition.signalAll();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}