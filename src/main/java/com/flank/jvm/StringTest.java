package com.flank.jvm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author flank
 * @date 2021/3/4 10:49
 */
public class StringTest {
    @Test
    public void test2() {
        String s1 = "h";
        //s1的指向String对象的地址变了
        s1 += "e";

        //final修饰的变量是最终变量，不能修改变量的reference
        final String s2 = "hello";
        // s2 += "wolrd";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a");
        stringBuffer.append("b");
        System.out.println(stringBuffer);
    }

    @Test
    public void test1(){
        String s1 = "hello";//字面量定义，“hello”存储在字符串常量池中
        String s2 = "hello";
        s1 += "world";
        s2.replace('e', 'd');
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
    @Test
    public void test3(){
        final char[] chars = {'1', '2'};
        chars[0] = '3';
        System.out.println(Arrays.toString(chars));//32
    }

}
