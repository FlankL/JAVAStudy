package com.flank.jvm;

/**
 * @author flank
 * @date 2021/3/9 13:04
 */
public class StringIntern3 {
    public static void main(String[] args) {
        String s = new String("11").intern();
        String s2 = "11";
        System.out.println(s == s2);//true
    }
}
