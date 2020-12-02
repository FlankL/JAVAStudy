package com.flank.threadpool.example2;

import java.util.concurrent.*;

/**
 * @author flank
 * @date 2020/12/2 14:50
 */
public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        /**
         * Callable:也是创建一个可执行的任务，如果有返回值可以用调用接口(Callable)，如果没有返回值可以用运行接口(Runnable)
         * Future:是用来获取返回结果和获取任务的执行状态
         * execute()和submit():方法的区别，前者执行Runnable任务，后者既可以执行Runnable任务，也可以执行Callable任务
         */
        Callable<String> task = () -> "hello,world";
        Future<String> submit = executorService.submit(task);
        System.out.println(submit.isCancelled());
        System.out.println(submit.isDone());
        System.out.println(submit.get());
        System.out.println(submit.isDone());

        executorService.shutdown();

    }
}
