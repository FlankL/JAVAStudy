package com.flank.javastudy.designpattern.createpatter.base;

/**
 * @author: flank
 * @date: 2022/1/22
 * @description:
 */
public class ProductB implements Product{
    @Override
    public void call() {
        System.out.print("productB on call");
    }
}
