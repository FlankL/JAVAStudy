package com.flank.javastudy.jdk8stream;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 交易记录
 * @author flank
 * @date 2020/11/24 13:55
 */
@AllArgsConstructor
@Data
public class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;

}
