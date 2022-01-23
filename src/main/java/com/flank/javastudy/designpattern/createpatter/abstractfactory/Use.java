package com.flank.javastudy.designpattern.createpatter.abstractfactory;

import com.flank.javastudy.designpattern.createpatter.base.Product;

/**
 * @author: flank
 * @date: 2022/1/22
 * @description:
 */
public class Use {
    public static void main(String[] args) throws Exception {
        AbstractFactory productAFactory = FactoryProducer.getFactory("com.flank.javastudy.designpattern.createpatter.abstractfactory.ProductAFactory");
        Product productA001 = productAFactory.getProduct("com.flank.javastudy.designpattern.createpatter.base.ProductA001");
        productA001.call();
    }
}
