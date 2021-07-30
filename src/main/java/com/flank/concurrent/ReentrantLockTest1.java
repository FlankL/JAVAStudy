package com.flank.concurrent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试ReetrantLock的可重入
 * 一个lock对象可以被同一线程加锁多次。
 *
 * @author flank
 * @date 2021/4/12 14:42
 */
public class ReentrantLockTest1 {
    public static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        lock.lock();
        try {
            System.out.println("第一次获取锁："+lock.getHoldCount());
            lock.lock();
            System.out.println("第二次获取锁："+lock.getHoldCount());
        } finally {
            //加锁几次就要解锁几次。要不然锁不会释放
            lock.unlock();
            lock.unlock();
        }
        //如果次数不为0，则其他线程是拿不到锁的
        System.out.println("当前线程持有锁的次数："+lock.getHoldCount());
    }
}
