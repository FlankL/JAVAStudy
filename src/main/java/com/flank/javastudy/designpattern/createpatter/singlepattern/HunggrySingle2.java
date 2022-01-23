package com.flank.javastudy.designpattern.createpatter.singlepattern;

/**
 * 双重校验锁的懒汉模式
 * @author: flank
 * @date: 2022/1/23
 * @description:
 */
public class HunggrySingle2 {
    private static HunggrySingle2 instance=null;

    private HunggrySingle2(){};

    public static HunggrySingle2 getInstance(){
        if (instance == null) {
            synchronized (HunggrySingle2.class){
                if (instance == null) {
                    return new HunggrySingle2();
                }
            }
        }
        return instance;
    }
}
