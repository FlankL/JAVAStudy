package com.flank.javastudy.designpattern.createpatter.commandpattern;

/**
 * @author: flank
 * @date: 2022/1/24
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        OrderQry orderQry = new OrderQry();

        BuyCmd buyCmd = new BuyCmd(orderQry);
        SellCmd sellCmd = new SellCmd(orderQry);

        Broker broker = new Broker();
        broker.takeOrder(buyCmd);
        broker.takeOrder(sellCmd);

        broker.consumeOrder();
    }
}                                                                                                                                    