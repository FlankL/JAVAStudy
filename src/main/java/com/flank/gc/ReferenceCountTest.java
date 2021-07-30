package com.flank.gc;

/**
 * 验证java没有使用引用计数算法
 * -XX:+PrintGCDetails
 * @author flank
 * @date 2021/3/10 21:50
 */
public class ReferenceCountTest {
    private final static byte[] BYTES = new byte[5 * 1024 * 1024];//5M的字节数组大小
    Object reference = null;

    public static void main(String[] args) {
        ReferenceCountTest test1 = new ReferenceCountTest();
        ReferenceCountTest test2 = new ReferenceCountTest();

        test1.reference = test2;
        test2.reference = test1;

        test1 = null;
        test2 = null;
        System.gc();
    }
}
