package com.flank.javastudy.jdk8lambda.impl;

import com.flank.javastudy.jdk8lambda.FilterInterface;
import com.flank.javastudy.jdk8lambda.Student;

/**
 * @author flank
 * @date 2020/11/20 14:04
 */
public class FilterByLoveSubject implements FilterInterface<Student> {

    @Override
    public boolean filter(Student student) {
        return student.getLoveSubject().equals("Java");
    }
}
