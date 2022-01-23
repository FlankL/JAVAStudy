package com.flank.bytecode;

/**
 *
 * 成员变量(非静态)的赋值过程
 * 默认初始化-》显式初始化/代码块中初始化--》构造器中初始化---》有了对象，可以对象.属性或对象.方法的方式对成员变量进行赋值。
 * @author flank
 * @date 2021/3/18 9:23
 */
class Father{
    int x=10;
    public Father() {
        this.print();
        x=30;
    }
    public void print(){
        System.out.println("father.x="+x);
    }
}

class Son extends Father {
    int x=20;

    public Son() {
        this.print();
        x=40;
    }

    public void print(){
        System.out.println("Son.x="+x);
    }
}
public class SonTest  {
    public static void main(String[] args) {
        Father father = new Son();
        System.out.println(father.x);
    }
}
