package com.flank.bytecode;

import java.util.Random;

/**
 * @author flank
 * @date 2021/3/18 10:18
 */
public class Demon {
    private static  final int AGE=new Random().nextInt(10);
    private static  final int BIG=10;

    private int num = 1;

    public int add() {
        synchronized (this) {
            num = num + 2;
            return num;
        }
    }
}
