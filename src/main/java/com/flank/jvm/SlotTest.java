package com.flank.jvm;


import java.util.Date;

/**
 * @author flank
 * @date 2021/2/25 14:21
 */
public class SlotTest {
    private int age;

    public SlotTest(int age) {
        this.age = age;
    }

    public void hello() {
        int i = 1;
        int j = 3;
        int k = i + j;
        System.out.println(i + j + this.age);
    }

    public static void test2() {
        Date date = new Date();
        String flank = "flank";
    }

    public void test3() {
        //重复利用：局部变量表的长度是3，因为c使用已经销毁的变量b的slot
        int a = 3;
        {
            int b = 2;
            b = a + 1;
        }
        int c = 4;
    }

    public void test4() {
        int a;
    }

    public void test5() {
        byte i = 15;
        int j = 8;
        int k = i + j;
    }
}
