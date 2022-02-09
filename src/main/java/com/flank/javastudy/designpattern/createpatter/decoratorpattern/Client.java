package com.flank.javastudy.designpattern.createpatter.decoratorpattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle();
        CircleDecrator circleDecrator = new CircleDecrator(circle);
        circleDecrator.draw();
    }
}
