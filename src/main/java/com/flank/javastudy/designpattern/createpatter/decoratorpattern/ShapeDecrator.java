package com.flank.javastudy.designpattern.createpatter.decoratorpattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class ShapeDecrator implements Shape {
    private Shape shape;

    public ShapeDecrator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
