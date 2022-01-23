package com.flank.concurrent;

/**
 * @author flank
 * @date 2021/5/31 14:08
 */
public class SyncDemon {
    static int num = 0;
    Object object1 = new Object();
    Object object2 = new Object();

    void increase() {
        synchronized (object1) {
            num++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    void increase2() {
        synchronized (object2) {
            num++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

    }
}
