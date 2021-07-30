package com.flank.concurrent;

import java.util.ArrayList;
import java.util.List;

/**
 * 生产者和消费者一：
 *      1.一个生产者，一个消费者 或者多个生产者和消费者
 *      2.使用synchronized ,wait(),notify(),notifyAll()
 * @author flank
 * @date 2021/4/9 14:49
 */
public class ConsumeProduct1 {
    public static void main(String[] args) {
        Buffer1 buffer1 = new Buffer1();
        new Thread(()->{
            try {
                buffer1.product();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"product-0").start();
        new Thread(()->{
            try {
                buffer1.product();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"product-1").start();

        new Thread(()->{
            try {
                buffer1.consume();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"consume-0").start();
        new Thread(()->{
            try {
                buffer1.consume();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"consume-1").start();
    }
}
class Buffer1{
    private List<Integer> buffer = new ArrayList<>();

    public void product() throws Exception {
        while (true) {
            synchronized (buffer) {
                //如果不为空，就停住当前线程
                //不能使用if判断，防止虚假唤醒
                while (!buffer.isEmpty()) {
                    buffer.wait();
                    System.out.println("buffer is full");
                }
                //如果为空，生产者就开始生产数据
                for (int i = 0; i < 5; i++) {
                    buffer.add(i);
                }
                //生产完之后，就唤醒其他线程
                buffer.notifyAll();
            }
        }

    }

    public void consume() throws Exception{
        while (true) {
            synchronized (buffer) {
                //如果buffer中没有数据，就停住消费
                //不能使用if判断，防止虚假唤醒
                while (buffer.isEmpty()) {
                    buffer.wait();
                    System.out.println("buffer is empty");
                }
                //如果有数据就开始消费
                for (int i = 0; i < buffer.size(); i++) {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
                //消费完清空数据,唤醒其他线程
                buffer.clear();
                buffer.notifyAll();
            }
        }
    }
}

