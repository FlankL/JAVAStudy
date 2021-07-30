package com.flank.jvm;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author flank
 * @date 2021/2/4 14:23
 */
public class TestTool {
   @Test
    public void testMap(){
       HashMap<Object, Object> map = new HashMap<>();
       map.put(1, "tom");
       map.put(2, "som");
       map.put(3, "gom");
       map.put(4, "aom");
      map.remove(1);
       map.forEach((key, value)-> System.out.println(key+":"+value));
   }
}
