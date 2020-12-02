package com.flank.threadpool.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * 可执行的任务
 * @author flank
 * @date 2020/12/2 14:24
 */
public class RunnableTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class ThreadPoolTest{
    public static void main(String[] args) {
        /**
         * 问题
         * 1.Executors的坏处，为什么不让使用？
         * 2.FixedThreadPool其实就是ThreadPoolExecutor的一种不同参数设置的表现形式
         * 3.execute和submit的区别？什么时候用Submit应该怎么用？返回的Future有什么用？
         * 4.Runnable和Callable有什么区别？什么时候使用Callable？怎么用？
         */
        //1.创建一个线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        //2.可以执行Runnable或者Callable代表的任务
        threadPool.execute(new RunnableTask());
        threadPool.execute(new RunnableTask());
        //3.关闭线程池
        threadPool.shutdown();



    }
}
