package com.flank.jvm;

/**
 * @author flank
 * @date 2021/3/4 9:35
 */
public class People {
    public int field;

    public People(int field) {
        this.field=field;
    }
}
class Boy extends People{


    public Boy(int field) {
        super(field);
    }

    public static void main(String[] args) {
        Boy boy = new Boy(12);
        System.out.println(boy.field);
    }
}


