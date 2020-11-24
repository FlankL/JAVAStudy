package com.flank.javastudy.jdk8concurrent;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * jdk8并发编程测试
 * @author flank
 * @date 2020/11/24 15:37
 */
public class CreateThread {

    /**
     * 创建线程
     */
    @Test
    public void testRunnable(){
        Runnable task = () -> {
            try {
                System.out.println("hello " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(10);
                System.out.println("world");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        //对象调用，直接用线程调用，没有经过创建线程的start0()方法
        task.run();
        //对象调用，直接用线程调用，没有经过创建线程的start0()方法
        new Thread(task).run();
        new Thread(task).start();
        System.out.println("Done");

    }

    /**
     * 测试ExecutorService
     */
    @Test
    public void testExecutor(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();



    }

}
