package com.flank.javastudy.jdk8optional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author flank
 * @date 2020/11/20 17:29
 */
@Data
@Builder
public class Address {
    private String name;

    public void hello() {
        System.out.println("hello");
    }
}
