package com.flank.javastudy.jdk8optional;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.Optional;

/**
 * @author flank
 * @date 2020/11/20 17:28
 */
@Data
@Builder
public class User {
    private String name;
    private Adress adress;
    private Optional<Adress> optionalAdress;
}

