package com.flank.jvm;

/**
 * @author flank
 * @date 2021/3/2 12:29
 */
public class HeapParams {
    private static final int age=3; //编译后赋值
    private static int a=4;//准备阶段赋处值，初始化阶段赋值
    private final int b=5;//编译后赋值
    public static void main(String[] args) {
        int c=6;//编译后赋值

    }
}
class HeapParams2{
    public static void main(String[] args) {
        System.out.println("HeapParams2");
    }
}


