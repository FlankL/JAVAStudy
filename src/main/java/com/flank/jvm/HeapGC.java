package com.flank.jvm;

import java.util.ArrayList;

/**
 * @author flank
 * @date 2021/3/2 9:49
 */
public class HeapGC {
    public static void main(String[] args) {
        long l = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        System.out.println(l);
        int i=0;
        try {
            ArrayList<String> list = new ArrayList<>();
            String a = "flank";
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("i = " + i);
        }
    }
}
