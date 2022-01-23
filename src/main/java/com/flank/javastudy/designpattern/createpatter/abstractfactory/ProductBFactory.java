package com.flank.javastudy.designpattern.createpatter.abstractfactory;

import com.flank.javastudy.designpattern.createpatter.base.Product;

/**
 * 工厂可以生产ProductB类型的产品
 * @author: flank
 * @date: 2022/1/22
 * @description:
 */
public class ProductBFactory extends AbstractFactory {
    @Override
    Product getProduct(String type) throws Exception{
        Class<?> aClass = Class.forName(type);
        return (Product)aClass.getDeclaredConstructor().newInstance();
    }
}
