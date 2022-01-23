package com.flank.javastudy.designpattern.createpatter.singlepattern;

/**
 * 单例模式的饿汉模式
 * @author: flank
 * @date: 2022/1/23
 * @description:
 */
public class HunggrySingle {
    private static HunggrySingle instance=null;

    private HunggrySingle(){};

    public static HunggrySingle getInstance(){
        if (instance == null) {
            return new HunggrySingle();
        }
        return instance;
    }
}
