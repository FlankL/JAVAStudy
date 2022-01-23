package com.flank.jvm;

import org.junit.Test;

/**
 * @author flank
 * @date 2021/3/9 8:39
 */
public class StringNewTest {
    public static void main(String[] args) {
        // String ab = new String("ab");
        String s = new String("a") + new String("b");
    }
    @Test
    public void test1(){
        String s = new String("1");//s指向的new出来的对象的地址
        s.intern();//调用此方法之前，字符串常量池中已经存在“1”
        String a1 = s.intern();//将字符串常量池中“1”的地址给a1
        String s2 = "1";//将字符串常量池中“1”的地址给s2
        System.out.println(s == s2);//false
        System.out.println(a1 == s2);//true

        String s3 = new String("1") + new String("1");//s3变量记录的地址是new String("11")
        //此时字符串常量池中没有“11”对象
        s3.intern();//在字符串常量池中创建“11”
        String a2 = s3.intern();//
        String s4 = "11";
        System.out.println(s3 == s4);//?
        System.out.println(a2 == s4);//?

    }
}
