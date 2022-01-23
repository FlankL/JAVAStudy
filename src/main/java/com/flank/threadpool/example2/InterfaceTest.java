package com.flank.threadpool.example2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author flank
 * @date 2020/12/4 16:31
 */
public interface InterfaceTest {
    void shutdown();


    List<Runnable> shutdownNow();


    boolean isShutdown();


    boolean isTerminated();


    boolean awaitTermination(long timeout, TimeUnit unit)
            throws InterruptedException;

    <T> Future<T> submit(Callable<T> task);


    <T> Future<T> submit(Runnable task, T result);


    Future<?> submit(Runnable task);

    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks)
            throws InterruptedException;

    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks,
                                  long timeout, TimeUnit unit)
            throws InterruptedException;

    <T> T invokeAny(Collection<? extends Callable<T>> tasks)
            throws InterruptedException, ExecutionException;

    <T> T invokeAny(Collection<? extends Callable<T>> tasks,
                    long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException;
}
