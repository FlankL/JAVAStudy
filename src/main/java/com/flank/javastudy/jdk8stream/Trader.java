package com.flank.javastudy.jdk8stream;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 交易员
 * @author flank
 * @date 2020/11/24 13:54
 */
@AllArgsConstructor
@Data
public class Trader {
    private final String name;
    private final String city;
}
