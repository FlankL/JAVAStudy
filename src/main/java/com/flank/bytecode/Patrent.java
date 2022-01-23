package com.flank.bytecode;

/**
 * @author flank
 * @date 2021/3/19 14:22
 */
public class Patrent {
    public String name;

    public Patrent(String name) {
        this.name = name;
    }

}
class Son1 extends Patrent{
    public Son1(String name) {
        super(name);
    }
}
class Demon2{
    public static void main(String[] args) {
        Son1 son1=new Son1("xiaoming");
        System.out.println(son1.name);
    }
}