package com.flank.javastudy.designpattern.createpatter.commandpattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class BuyCmd implements Order {
    private OrderQry orderQry;

    public BuyCmd(OrderQry orderQry) {
        this.orderQry=orderQry;
    }
    @Override
    public void execute() {
        orderQry.buy();
    }
}
