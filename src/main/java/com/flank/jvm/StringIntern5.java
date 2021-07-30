package com.flank.jvm;

/**
 * 测试使用intern()后的内存使用对比
 * @author flank
 * @date 2021/3/9 13:38
 */
public class StringIntern5 {
    private static final int MAX_COUNT = 1000 * 10000;
    private static final String[] arr = new String[MAX_COUNT];
    private static final int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i <MAX_COUNT; i++) {
            arr[i] = String.valueOf(data[i % data.length]);//时间:6693
            // arr[i] = String.valueOf(data[i % data.length]).intern();//时间:1218
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为:" + (end - start));

        //让程序阻塞
        try {
            Thread.sleep(1_000_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //手动进行垃圾回收
        System.gc();
    }
}
