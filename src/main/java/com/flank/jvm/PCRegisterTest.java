package com.flank.jvm;

/**
 * @author flank
 * @date 2021/2/23 20:14
 */
public class PCRegisterTest {
    private static int age =10;
    public static void main(String[] args) {
        int i=10;
        int j=12;
        int z=i+j;
        age++;

        String s = "abc"+"d";
        System.out.println(i);
        System.out.println(z);
    }
}
