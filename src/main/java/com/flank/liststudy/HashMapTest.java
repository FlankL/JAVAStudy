package com.flank.liststudy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * @author flank
 * @date 2021/6/2 16:50
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map = new LinkedHashMap<>();
        TreeMap<Integer, Integer> map1 = new TreeMap<>();
        map1.put(1, 14);
        map1.put(3, 15);
        map1.put(4, 16);
        map1.put(6, 17);
        map1.put(8, 18);
        map1.forEach((k,v)->{
            System.out.println(k+":"+v);
        });

    }
}
