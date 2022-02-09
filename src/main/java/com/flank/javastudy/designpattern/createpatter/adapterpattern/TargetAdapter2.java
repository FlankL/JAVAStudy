package com.flank.javastudy.designpattern.createpatter.adapterpattern;

/**
 * 对象适配
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class TargetAdapter2 implements Target{
    private Adaptee adaptee;

    public TargetAdapter2(Adaptee adaptee) {
        this.adaptee=adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specialRequest();
    }
}
