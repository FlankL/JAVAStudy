package com.flank.threadpool.createthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式3-任务有返回值
 * @author flank
 * @date 2020/12/4 10:58
 */
public class CreateThread3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.创建一个可被调用的任务(和Ruannble的区别是任务有返回值)
        Callable<String> task = () -> "hello,world";
        //2.Thread的构造器不能接收Callable任务，所以使用FutureTask包裹一下
        FutureTask<String> futureTask = new FutureTask<String>(task);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());

    }
}
