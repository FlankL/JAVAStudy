package com.flank.javastudy.designpattern.createpatter.adapterpattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        ConcereteTarget concereteTarget = new ConcereteTarget();
        concereteTarget.request();

        TargetAdapter targetAdapter = new TargetAdapter();
        targetAdapter.request();

        TargetAdapter2 targetAdapter2 = new TargetAdapter2(new Adaptee());
        targetAdapter2.request();
    }
}
