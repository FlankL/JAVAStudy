package com.flank.jvm;


import java.util.ArrayList;

/**
 * @author flank
 * @date 2021/3/1 13:41
 */
public class HeapOOM {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        while (true) {
            objects.add(new Object());
        }
    }
}
