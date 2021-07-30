package com.flank.gc;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * 使用MAT分析程序运行时的GCRoots
 * @author flank
 * @date 2021/3/11 13:06
 */
public class GCRootsTest {
    public static void main(String[] args) {
        ArrayList<Object> numList = new ArrayList<>();

        Date date = new Date();
        for (int i = 0; i < 100; i++) {
            numList.add(String.valueOf(i));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("数据添加完毕，请操作");
        new Scanner(System.in).next();

        numList=null;
        date=null;

        System.out.println("numList,date 已经置空请操作：");
        new Scanner(System.in).next();

        System.out.println("end");
        System.gc();


    }
}
