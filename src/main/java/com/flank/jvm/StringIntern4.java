package com.flank.jvm;

/**
 * @author flank
 * @date 2021/3/9 13:13
 */
public class StringIntern4 {
    public static void main(String[] args) {
        //相当于new String("ab")但是字符串常量池中没有“ab”
        String s = new String("a") + new String("b");
        //jdk6,在字符串常量池中新建了一个“ab”
        //jdk7/8,字符串常量池中记录的是对象引用地址。
        String s2 = s.intern();


        System.out.println(s2 == "ab");//jdk6:true  jdk7/8:true
        System.out.println(s == "ab");//jdk6:false   jdk7/8:true
    }
}
