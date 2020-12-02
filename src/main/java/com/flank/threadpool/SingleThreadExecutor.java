package com.flank.threadpool;

/**
 * 单线程来处理请求
 * @author flank
 * @date 2020/12/1 17:01
 */
public class SingleThreadExecutor implements Executor {
    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
