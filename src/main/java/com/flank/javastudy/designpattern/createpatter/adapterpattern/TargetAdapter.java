package com.flank.javastudy.designpattern.createpatter.adapterpattern;

/**
 * 类适配
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class TargetAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specialRequest();
    }
}
