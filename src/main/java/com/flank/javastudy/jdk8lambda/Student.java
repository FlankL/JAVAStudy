package com.flank.javastudy.jdk8lambda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author flank
 * @date 2020/11/20 13:17
 */
@Data
@Builder
public class Student {
    /**
     * 学生姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     *爱好的学科
     */
    private String loveSubject;

}
