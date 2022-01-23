package com.flank.threadpool.createthread;

import org.springframework.scheduling.concurrent.CustomizableThreadFactory;
import org.springframework.scheduling.concurrent.DefaultManagedAwareThreadFactory;

import java.util.concurrent.*;

/**
 * 通过线程池的方式创建线程池
 *
 * @author flank
 * @date 2020/12/4 11:03
 */
public class CreateThread4 {
    public static void main(String[] args) {


        //1.创建可执行任务
        Runnable task = () -> System.out.println("hello world");
        //2.创建线程池
        //ThreadFactory是用来自定义线程的名字，默认使用  Executors.defaultThreadFactory()
        ExecutorService executor = new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(10), new CustomizableThreadFactory("threadpool-"));
        //3.提交任务给线程执行
        executor.submit(task);
        executor.submit(task);
        //4.关闭线程池
        executor.shutdown();
    }
}
