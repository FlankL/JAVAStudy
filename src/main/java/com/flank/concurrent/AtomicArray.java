package com.flank.concurrent;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * 以原子的方式操作数组中的元素
 * @author flank
 * @date 2021/4/14 14:35
 */
public class AtomicArray {
    public static void main(String[] args) {
        int[] value = {1, 2, 3, 4, 5};
        //会通过clone()复制一份出来。
        AtomicIntegerArray atomicArray = new AtomicIntegerArray(value);
        //1.以原子的方式设置new值
        int andSet = atomicArray.getAndSet(0,6);
        System.out.println(value[0]);//0
        System.out.println(atomicArray.get(0));//6
        System.out.println(andSet);//返回老值1

        //2.以原子方式将输入值与数组中索引位置响应的值相加。
        atomicArray.addAndGet(1,2);
        System.out.println(atomicArray.get(1));

        //3.如果当前值等于预期值，则以原子的方式将i位置的值改为new值
        atomicArray.compareAndSet(2, 3, 10);
        System.out.println(atomicArray.get(2));

    }

}
