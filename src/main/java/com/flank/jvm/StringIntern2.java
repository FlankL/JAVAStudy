package com.flank.jvm;


/**
 * @author flank
 * @date 2021/3/9 12:49
 */
public class StringIntern2 {
    public static void main(String[] args) {
        String s = new String("1") + new String("1");
        s.intern();
        String s2 = "11";
        System.out.println(s==s2);//true

    }
}
