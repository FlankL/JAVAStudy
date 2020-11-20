package com.flank.javastudy.jdk8lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 用来根据条件过滤学生
 * @author flank
 * @date 2020/11/20 13:38
 */
public class StudentFilter {
    /**
     * 根据年龄过滤
     * @param students
     * @return
     */
    public List<Student> filterByAge(List<Student> students) {
        List<Student> tmp = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > 15) {
                tmp.add(student);
            }
        }
        return tmp;
    }
    /**
     * 根据爱好的学科过滤
     * @param students
     * @return
     */
    public List<Student> filterByLove(List<Student> students) {
        List<Student> tmp = new ArrayList<>();
        for (Student student : students) {
            if (student.getLoveSubject() == "Java") {
                tmp.add(student);
            }
        }
        return tmp;
    }

}
