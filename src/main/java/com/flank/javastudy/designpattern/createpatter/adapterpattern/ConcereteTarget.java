package com.flank.javastudy.designpattern.createpatter.adapterpattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class ConcereteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcereteTarget request");
    }
}
