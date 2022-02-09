package com.flank.javastudy.designpattern.createpatter.decoratorpattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw an rectangle");
    }
}
