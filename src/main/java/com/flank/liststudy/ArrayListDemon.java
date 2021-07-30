package com.flank.liststudy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Stream;

/**
 * @author flank
 * @date 2021/4/20 9:13
 */
public class ArrayListDemon {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(100_000_000);
        for (int i = 0; i < 100_000_000; i++) {
            integers.add(i);
        }
        long start = System.currentTimeMillis();

        // 遍历方式一:for循环迭代
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
        // 遍历方式二：迭代器迭代
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        //遍历方式三:使用流来遍历集合
        Stream<Integer> stream = integers.stream();
        stream.forEach(System.out::println);

        long end= System.currentTimeMillis();
        System.out.println("花费时间： "+(end-start)/1000+"s");
        //遍历方式一花费时间：34s
        //遍历方式二花费时间：33s
        //遍历方式三花费时间：33s






    }
}
