package com.flank.javastudy.designpattern.createpatter.brigepattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color){
        this.color=color;
    }

    public abstract void shape();
}
