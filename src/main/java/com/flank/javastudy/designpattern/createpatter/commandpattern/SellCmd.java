package com.flank.javastudy.designpattern.createpatter.commandpattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class SellCmd implements Order {
    private OrderQry orderQry;

    public SellCmd(OrderQry orderQry) {
        this.orderQry=orderQry;
    }
    @Override
    public void execute() {
        this.orderQry.sell();
    }
}
