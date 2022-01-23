package com.flank.javastudy.designpattern.createpatter.singlepattern;

/**
 * 懒汉式
 * @author: flank
 * @date: 2022/1/23
 * @description:
 */
public class LazySinglePattern {
    private static LazySinglePattern instance=new LazySinglePattern();

    private LazySinglePattern(){};

    public LazySinglePattern getInstance(){
        return instance;
    }

}
