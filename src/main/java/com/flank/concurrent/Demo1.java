package com.flank.concurrent;/**
 * @author flank
 * @date 2021/4/9 11:22
 */
class Product {
    private String name;
    private int count;
    private boolean flag;

    // 生产产品的功能
    public synchronized void produce(String name) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = count + "个" + name;
        System.out.println(Thread.currentThread().getName() + "生产了" + this.name);
        count++;
        flag = true;
        notify();
    }

    // 消费产品的功能
    public synchronized void consume() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "消费了" + this.name);
        flag = false;
        notify();
    }

}

// 生产任务
class Producer implements Runnable {
    private Product pro;

    public Producer(Product pro) {
        this.pro = pro;

    }

    public void run() {
        while (true) {
            pro.produce("笔记本");
        }

    }

}

// 消费任务
class Consumer implements Runnable {
    private Product pro;

    public Consumer(Product pro) {
        this.pro = pro;

    }

    public void run() {
        while (true) {
            pro.consume();
        }
    }
}

public class Demo1 {

    public static void main(String[] args) {
        Product pro = new Product();

        Producer producer = new Producer(pro);
        Consumer consumer = new Consumer(pro);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();

    }

}