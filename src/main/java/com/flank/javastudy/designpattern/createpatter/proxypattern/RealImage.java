package com.flank.javastudy.designpattern.createpatter.proxypattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName=fileName;
        loadFile(fileName);
    }

    @Override
    public void display() {
        System.out.println("display "+ fileName);
    }

    public void loadFile(String fileName) {
        System.out.println("loading "+fileName);
    }
}
