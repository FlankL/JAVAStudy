package com.flank.threadpool;

/**
 * 请求的执行，可以有多种方式
 * @author flank
 * @date 2020/12/1 16:59
 */
public interface Executor {
    void execute(Runnable runnable);
}
