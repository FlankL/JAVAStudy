package com.flank.javastudy.designpattern.createpatter.simplefactory;

import com.flank.javastudy.designpattern.createpatter.base.Product;
import com.flank.javastudy.designpattern.createpatter.base.ProductA;
import com.flank.javastudy.designpattern.createpatter.base.ProductB;

/**
 * 简单工厂的变形
 * @author: flank
 * @date: 2022/1/22
 * @description:
 */
public class SimpleProductFactory2 {
    public static Product getProductA(){
        return new ProductA();
    }
    public static Product getProductB(){
        return new ProductB();
    }
}
