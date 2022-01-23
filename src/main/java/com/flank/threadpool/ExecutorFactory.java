package com.flank.threadpool;

/**
 * 创建Executor的工厂，返回创建对象
 * @author flank
 * @date 2020/12/1 17:03
 */
public class ExecutorFactory {
    public  static  Executor newExecutor(String executorTye){
        switch (executorTye) {
            case "single":
                return new SingleThreadExecutor();
            case "thread_per_task":
                return new ThreadPerTaskExecutor();
            default:
                return new SingleThreadExecutor();
        }
    }
}
