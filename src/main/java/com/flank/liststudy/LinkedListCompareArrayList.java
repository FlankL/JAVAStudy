package com.flank.liststudy;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 比较linkedList和ArrayList的遍历效率
 * @author flank
 * @date 2021/4/20 16:30
 */
public class LinkedListCompareArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(1_000_000);
        LinkedList<Integer> integers1 = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            integers1.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < integers1.size(); i++) {
            System.out.println(integers1.get(i));
        }
        long end = System.currentTimeMillis();
        System.out.println("花费时间： "+(end-start)/1000+"s");
        //ArrayList花费时间: 3s
        //LinkedList花费时间:   s
    }
}
