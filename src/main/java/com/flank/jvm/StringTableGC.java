package com.flank.jvm;


/**
 * -Xms15m -Xmx15m -XX:+PrintStringTableStatistics -XX:+PrintGCDetails
 * @author flank
 * @date 2021/3/9 15:00
 */
public class StringTableGC {
    public static void main(String[] args) {
        String ab = new String("ab");
        for (int i = 0; i < 100000; i++) {
            String.valueOf(i).intern();
        }
    }
}
