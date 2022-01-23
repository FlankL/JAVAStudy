package com.flank.liststudy;

/**
 * @author flank
 * @date 2021/4/20 15:23
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        PersonCopy personCopy = new PersonCopy("张三", 20, new int[]{1, 2, 3});
        PersonCopy clonePerson = (PersonCopy) personCopy.clone();
        System.out.println("-----------克隆前------");
        System.out.println(personCopy);
        System.out.println("-----------克隆后------");
        clonePerson.hobby[0]=4;
        System.out.println(personCopy);

    }
}
