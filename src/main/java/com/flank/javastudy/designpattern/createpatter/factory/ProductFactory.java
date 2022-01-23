package com.flank.javastudy.designpattern.createpatter.factory;

import com.flank.javastudy.designpattern.createpatter.base.Product;
import com.flank.javastudy.designpattern.createpatter.base.ProductA;
import com.flank.javastudy.designpattern.createpatter.base.ProductB;

/**
 * 工厂模式
 * @author: flank
 * @date: 2022/1/22
 * @description:
 */
public abstract class ProductFactory {
    public abstract Product createProduct();
}
class ProductAFactory extends ProductFactory{

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
class ProducatBFactory extends ProductFactory{

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}