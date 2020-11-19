package com.flank.javastudy.jdk8extend;

/**
 * @description: 练习使用jdk8的接口
 * @Time: 2020/11/19 22:51
 * @auther: Flank
 */
public interface Animal {
    void run();

    default void eat() {
        System.out.println("eating");
    }

    static void dancing() {
        System.out.println("dancing");
    }
}

class Pig implements Animal {
    @Override
    public void run() {
        System.out.println("pig run");
    }
}

class Dog implements Animal {

    @Override
    public void run() {
        System.out.println("dog run");
    }

    /**
     * 接口的默认方法可以重写
     */
    @Override
    public void eat() {
        System.out.println("dog eating");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        Animal.dancing();
    }
}



