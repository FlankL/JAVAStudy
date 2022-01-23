package com.flank.javastudy.designpattern.createpatter.abstractfactory;

import com.flank.javastudy.designpattern.createpatter.base.Product;

/**
 * 抽象工厂模式
 * @author: flank
 * @date: 2022/1/22
 * @description:
 */
public abstract class AbstractFactory {
    abstract  Product getProduct(String type) throws Exception;
}
