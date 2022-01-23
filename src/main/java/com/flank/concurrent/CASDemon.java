package com.flank.concurrent;

/**
 * CAS的模拟
 * @author flank
 * @date 2021/4/13 9:58
 */
public class CASDemon {
    public static void main(String[] args) {
        String A="aa";
        //当前线程循环的去比较
        while (true) {
            String V=A;
            //线程操作A数据,修改后的数据是B
            String B = "bb";
            if (V == A) {
                A=B;
            }
        }
    }
}
