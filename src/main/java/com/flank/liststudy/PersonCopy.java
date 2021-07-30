package com.flank.liststudy;

import java.util.Arrays;

/**
 * @author flank
 * @date 2021/4/20 15:22
 */
public class PersonCopy implements Cloneable {
    String name;
    int age;
    public int[] hobby;

    public PersonCopy(String name, int age, int[] hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "PersonCopy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

