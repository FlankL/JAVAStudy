package com.flank.javastudy.designpattern.createpatter.facadepattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
    }
}
