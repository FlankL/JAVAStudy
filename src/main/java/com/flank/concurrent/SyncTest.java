package com.flank.concurrent;

/**
 * @author flank
 * @date 2021/3/29 20:41
 */
public class SyncTest {

    public void hello() {
        int a = 0;
        synchronized (this) {
            a++;
        }
    }
    public synchronized void hello2(){

    }
}





