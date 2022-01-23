package com.flank.concurrent;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author flank
 * @date 2021/4/15 8:55
 */
public class PipedStream {
    //1.创建输入流,输出流
    private static PipedInputStream pis = new PipedInputStream();
    private static PipedOutputStream pos = new PipedOutputStream();

    public static void main(String[] args) {
        try {
            //2. 通道进行连接
            pos.connect(pis);
            //3.创建生产数据的线程
            new Thread(() -> {
                int i=0;
                while (true) {
                    try {
                        Thread.sleep(1000);
                        pos.write(i);
                        i++;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, "product").start();

            new Thread(() -> {
                while (true) {
                    try {
                        System.out.println(Thread.currentThread().getName()+": "+pis.read());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }, "consume").start();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
