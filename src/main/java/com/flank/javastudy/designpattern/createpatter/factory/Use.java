package com.flank.javastudy.designpattern.createpatter.factory;

import com.flank.javastudy.designpattern.createpatter.base.Product;

/**
 * @author: flank
 * @date: 2022/1/22
 * @description:
 */
public class Use {
    public static void main(String[] args) {
        ProductAFactory productAFactory = new ProductAFactory();
        Product product = productAFactory.createProduct();
        product.call();
    }
}
