package com.flank.javastudy.jdk8optional;

import lombok.Data;

/**
 * @author flank
 * @date 2020/11/20 17:29
 */
@Data
public class Adress {
    private String name;
    public void hello(){
        System.out.println("hello");
    }
}
