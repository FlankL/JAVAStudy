package com.flank.threadpool;

/**
 * 每个请求都创建一个线程去处理
 * @author flank
 * @date 2020/12/1 17:01
 */
public class ThreadPerTaskExecutor implements Executor{
    @Override
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
