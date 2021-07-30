package com.flank.jvm;

/**
 *
 * -Xms:堆空间初始内存大小(新生代+老年代)
 *      -X 是JVM运行参数
 *      ms  是memory start
 * -Xmx:堆空间最大内存大小
 * @author flank
 * @date 2021/3/1 12:53
 */
public class HeapSize {
    public static void main(String[] args) {
        //返回java虚拟机中的堆内存总量
        long l = Runtime.getRuntime().totalMemory()/1024/1024;
        //返回最大堆内存大小
        long maxMeory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        System.out.println("-Xms = " + l+"M");
        System.out.println("-Xmx = " + maxMeory+"M");

        System.out.println("系统内存大小为:"+l*64.0/1024+"G");
        System.out.println("系统内存大小为:"+maxMeory*4.0/1024+"G");

        try {
            Thread.sleep(1_000_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
