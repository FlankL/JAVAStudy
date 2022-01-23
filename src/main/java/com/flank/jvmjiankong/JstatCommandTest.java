package com.flank.jvmjiankong;

import java.util.ArrayList;

/**
 * -Xms60m -Xmx60m -XX:SurvivorRatio=8
 * -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=d:\a.hprof
 * @author flank
 * @date 2021/3/22 16:46
 */
public class JstatCommandTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<byte[]> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            byte[] bytes = new byte[1024 * 100];//100KB
            list.add(bytes);
            Thread.sleep(1200);
        }
    }
}
