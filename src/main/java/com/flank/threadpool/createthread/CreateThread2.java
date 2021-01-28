package com.flank.threadpool.createthread;

/**
 * 通过实现Runnable接口实现
 * @author flank
 * @date 2020/12/4 10:51
 */
public class CreateThread2 {
    public static void main(String[] args) {
        //通过lambda创建一个可执行的任务
        Runnable task = () -> System.out.println("hello");
        //创建线程执行任务
        new Thread(task).start();
    }
}
