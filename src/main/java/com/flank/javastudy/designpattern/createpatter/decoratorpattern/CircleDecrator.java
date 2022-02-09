package com.flank.javastudy.designpattern.createpatter.decoratorpattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class CircleDecrator extends ShapeDecrator {
    public CircleDecrator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setBorder();
    }

    public void setBorder() {
        System.out.println("bolder is red");
    }
}
