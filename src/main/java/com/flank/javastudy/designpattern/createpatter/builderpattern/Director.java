package com.flank.javastudy.designpattern.createpatter.builderpattern;

/**
 * @author: flank
 * @date: 2022/1/23
 * @description:
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder=builder;
    }

    /**
     * 产品构建和组装的关系
     * @return
     */
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        return builder.getResult();
    }
}
