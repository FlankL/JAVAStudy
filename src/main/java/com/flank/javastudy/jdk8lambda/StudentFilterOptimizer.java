package com.flank.javastudy.jdk8lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 对过滤器1进行优化
 * @author flank
 * @date 2020/11/20 13  :56
 */
public class StudentFilterOptimizer {
    public List<Student> getStudents(List<Student> students,FilterInterface<Student> filter) {
        List<Student> tmp = new ArrayList<>();
        for (Student student : students) {
            if (filter.filter(student)) {
                tmp.add(student);
            }
        }
        return tmp;
    }
}
