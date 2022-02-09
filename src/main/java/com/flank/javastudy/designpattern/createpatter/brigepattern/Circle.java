package com.flank.javastudy.designpattern.createpatter.brigepattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void shape() {
        System.out.println("circle: "+super.color.color());
    }
}
