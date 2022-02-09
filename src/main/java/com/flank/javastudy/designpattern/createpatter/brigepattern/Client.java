package com.flank.javastudy.designpattern.createpatter.brigepattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle(new Red());
        circle.shape();

        Circle circle1 = new Circle(new Green());
        circle1.shape();
    }
}
