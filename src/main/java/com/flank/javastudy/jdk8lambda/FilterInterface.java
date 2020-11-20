package com.flank.javastudy.jdk8lambda;

/**
 * 过滤的接口
 * @author flank
 * @date 2020/11/20 13:54
 */
public interface FilterInterface<T> {
    boolean filter(T t);
}
