package com.flank.javastudy.designpattern.createpatter.commandpattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class OrderQry {
    private String name="abc";
    private int num=10;

    public void buy(){
        System.out.println(String.format("buy name:%s,num:%s", this.name,this.num));
    }

    public void sell(){
        System.out.println(String.format("sell name:%s,num:%s", this.name,this.num));
    }
}
