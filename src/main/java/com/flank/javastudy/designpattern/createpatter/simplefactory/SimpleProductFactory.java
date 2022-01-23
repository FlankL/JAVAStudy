package com.flank.javastudy.designpattern.createpatter.simplefactory;

import com.flank.javastudy.designpattern.createpatter.base.Product;
import com.flank.javastudy.designpattern.createpatter.base.ProductA;
import com.flank.javastudy.designpattern.createpatter.base.ProductB;


/**
 * 简单工厂
 * @author: flank
 * @date: 2022/1/22
 * @description:
 */
public class SimpleProductFactory {
    public static Product getProduct(String type) {
        switch (type){
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                throw new RuntimeException("无对应类型的产品");
        }
    }
}
