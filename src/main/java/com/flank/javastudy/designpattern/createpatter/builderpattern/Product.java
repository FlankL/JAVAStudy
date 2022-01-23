package com.flank.javastudy.designpattern.createpatter.builderpattern;

import lombok.Data;

/**
 * @author: flank
 * @date: 2022/1/23
 * @description:
 */
@Data
public class Product {
    private String partA;
    private String partB;

    public void show(){
        System.out.println(partA+"\n"+partB);
    }
}
