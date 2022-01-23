package com.flank.javastudy.designpattern.createpatter.abstractfactory;

/**
 * @author: flank
 * @date: 2022/1/22
 * @description:
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type) throws Exception{
        Class<?> aClass = Class.forName(type);
        return (AbstractFactory)aClass.getDeclaredConstructor().newInstance();
    }
}
