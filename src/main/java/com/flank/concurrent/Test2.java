package com.flank.concurrent;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author flank
 * @date 2021/4/9 11:32
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        System.out.println(integers.size());
        integers.clear();
        System.out.println(integers.size());
    }
}
