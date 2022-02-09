package com.flank.javastudy.designpattern.createpatter.proxypattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("image.jpeg");
        proxyImage.display();
    }
}
