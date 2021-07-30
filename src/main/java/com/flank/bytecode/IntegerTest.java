package com.flank.bytecode;

/**
 *
 * @author flank
 * @date 2021/3/18 8:35
 */
public class IntegerTest {
    public static void main(String[] args) {

        Integer x = 5;
        int y = 5;
        //x==y时，x自动拆箱
        System.out.println(x == y);//true

        //Integer有个cache数组，如果值是在[-128,127]之间直接从Integer的缓存数据中取对象
        Integer i1 = 10;
        Integer i2 = 10;
        //==对于引用类型比较的都是引用地址
        System.out.println(i1 == i2);//true

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);//false

    }
}
