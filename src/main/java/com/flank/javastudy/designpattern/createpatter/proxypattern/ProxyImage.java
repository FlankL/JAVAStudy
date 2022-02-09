package com.flank.javastudy.designpattern.createpatter.proxypattern;

import java.util.Optional;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        realImage = Optional.ofNullable(this.realImage).orElse(new RealImage(fileName));
//        if (Objects.isNull(this.realImage)) {
//            this.realImage = new RealImage(fileName);
//        }
        this.realImage.display();
    }
}
