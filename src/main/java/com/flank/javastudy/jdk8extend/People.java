package com.flank.javastudy.jdk8extend;

/**
 * @author: flank
 * @date: 2020/11/19
 * @description: 用来测试继承类
 */
public class People {
    public static  int staticVar=10;
    public int nonStaticVar=5;
    public static void hello(){
        System.out.println("people static method");
    }
    public final void run(){
        System.out.println("people run");
    }
}
class Man extends People {
    public int nonStaticVar=6;
    public Man() {
        this.run();
        super.run();
    }

    @Override
    public String toString() {
        return "Man{" +
                "nonStaticVar=" + nonStaticVar +
                '}';
    }

    public static void main(String[] args) {

        Man man = new Man();
    }

}

