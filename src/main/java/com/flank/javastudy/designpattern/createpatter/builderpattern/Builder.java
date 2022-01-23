package com.flank.javastudy.designpattern.createpatter.builderpattern;

/**
 * 抽象的构建者
 * @author: flank
 * @date: 2022/1/23
 * @description:
 */
public abstract class Builder {
    protected Product product=new Product();

    protected abstract void buildPartA();
    protected abstract void buildPartB();

    public Product getResult(){
        return product;
    }
}
