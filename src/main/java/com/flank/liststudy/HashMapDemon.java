package com.flank.liststudy;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemon {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("1", 2);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put(null, null);
    }
}
