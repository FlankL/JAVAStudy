package com.flank.jvm;

import org.junit.Test;

/**
 * @author flank
 * @date 2021/3/5 9:19
 */
public class StringTest6 {
    @Test
    public void test1() {
        String s1 = "a" + "b" + "c";//通过反编译就可以看出来
        String s2 = "abc";
        System.out.println(s1.equals(s2));//equals比较的是值，true
        System.out.println(s1 == s2);//引用对象==比较的是引用地址,常量拼接，编译后都存在常量池中， true
    }

    @Test
    public void test2() {
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        //如果拼接符号的前后出现了变量，则相当于在堆空间中new String(),具体的内容是拼接结果。
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;
        System.out.println("s3==s4 = " + (s3 == s4));//true
        System.out.println("s3==s5 = " + (s3 == s5));//false
        System.out.println("s3==s6 = " + (s3 == s6));//false
        System.out.println("s3==s7 = " + (s3 == s7));//false

        System.out.println("s5==s6 = " + (s5 == s6));//false
        System.out.println("s5==s7 = " + (s5 == s7));//false
        System.out.println("s6==s7 = " + (s6 == s7));//false

        //intern():判断字符串常量池中是否有字符串的值，如果存在，则返回已存在的值，如果不存在，则在常量池中创建一份，并返回
        String s8 = s6.intern();
        System.out.println("s3==s8 = " + (s3 == s8));//true
    }

    @Test
    public void test3() {
        String s1 = "abc";
        String s2 = "ab" + "c";
        System.out.println("s1==s2 = " + (s1 == s2));
    }

    @Test
    public void test4() {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;
        System.out.println("(s3==s4) = " + (s3 == s4));//false
    }

    @Test
    public void test5() {
        final String s1 = "a";//此时就不是变量了，
        final String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;
        System.out.println("(s3==s4) = " + (s3 == s4));//true
    }
    @Test
    public void test6(){
        String s1 = "";
        for (int i = 0; i < 30; i++) {
            s1 += "a";
        }
        System.out.println(s1);
    }
    @Test
    public void test7(){
        long start = System.currentTimeMillis();
        method1(100_000);//2160
        // method2(100_000);//3
        // method3(100_000);//6
        long end = System.currentTimeMillis();
        System.out.println("(start-end) = " + (end - start));
    }

    /**
     * 通过使用String.valueOf来将int类型转化为字符串类型
     */
    @Test
    public void test9(){
        //6226
        System.out.println(2);
        for (int i = 0; i < 2; i++) {
            String s = String.valueOf(i);
        }
        for (int i = 0; i < 2; i++) {
            StringBuffer stringBuffer = new StringBuffer();
        }
        System.out.println(3);
    }
    @Test
    public void test8(){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i);

            String string = String.valueOf(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("(end-start) = " + (end - start));
    }
    /**
     * 使用字符串做拼接，测试效率
     * @param num 拼接次数
     */
    public void method1(int num) {
        String s1 = "";
        for (int i = 0; i <num; i++) {
            s1 += "a";//每次循环都会创建一个StringBuilder，String
        }
    }

    /**
     * 使用StringBuilder测试字符串拼接效率
     * @param num 拼接次数
     */
    public void method2(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            stringBuilder.append("a");
        }
    }

    /**
     * 使用StringBuffer测试字符窜拼接效率
     * @param num
     */
    public void method3(int num) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < num; i++) {
            stringBuffer.append("a");
        }
    }

    @Test
    public void test10(){
        String hello = new StringBuilder("hello").toString();
        System.out.println(hello);

    }


}
