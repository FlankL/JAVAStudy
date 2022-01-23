package com.flank.javastudy.designpattern.createpatter.singlepattern;

/**
 * 内部类模式
 * @author: flank
 * @date: 2022/1/23
 * @description:
 */
public class InnerSingle {

    private InnerSingle(){};

    private static class InnerSingleHodler{
        private static InnerSingle instance=new InnerSingle();
    }
    public InnerSingle getInstance(){
        return InnerSingleHodler.instance;
    }
}
