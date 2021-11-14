package com.flank.javastudy.jdk8optional;

import lombok.Builder;
import lombok.Data;

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
    public static void main(String[] args){
        int[] file1 = {1, 2, 4};
        int[] file2 = {1, 2, 4};

    }
}
