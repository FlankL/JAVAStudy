package com.flank.javastudy.designpattern.createpatter.builderpattern;

/**
 * @author: flank
 * @date: 2022/1/23
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new ConcereteBuilder02());
        Product construct = director.construct();
        construct.show();
    }
}
