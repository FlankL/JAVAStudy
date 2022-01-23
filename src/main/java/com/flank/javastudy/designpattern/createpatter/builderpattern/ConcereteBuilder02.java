package com.flank.javastudy.designpattern.createpatter.builderpattern;

/**
 * @author: flank
 * @date: 2022/1/23
 * @description:
 */
public class ConcereteBuilder02 extends Builder{
    @Override
    protected void buildPartA() {
        product.setPartA("builder 02 set partA");
    }

    @Override
    protected void buildPartB() {
        product.setPartB("builder 02 set partB");
    }
}
