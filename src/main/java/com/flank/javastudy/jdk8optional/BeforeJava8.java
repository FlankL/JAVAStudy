package com.flank.javastudy.jdk8optional;

import java.util.Optional;

/**
 * @author flank
 * @date 2020/11/20 17:30
 */
public class BeforeJava8 {
    public static void main(String[] args) {
        User tom = User.builder().name("Tom").address(null).optionalAdress(Optional.empty()).build();
//        System.out.println(tom.getAddress().getName());
        System.out.println(tom.getOptionalAdress().map(Address::getName));
    }

}
