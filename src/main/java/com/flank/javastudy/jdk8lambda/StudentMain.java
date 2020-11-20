package com.flank.javastudy.jdk8lambda;

import com.flank.javastudy.jdk8lambda.impl.FilterByAge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flank
 * @date 2020/11/20 14:05
 */
public class StudentMain {
    public static void main(String[] args) {
        //创建一群学生
        ArrayList<Student> students = new ArrayList<>();
        students.add(Student.builder()
                .name("Tom")
                .age(10)
                .loveSubject("Java")
                .build());
        students.add(Student.builder()
                .name("Marry")
                .age(20)
                .loveSubject("python")
                .build());
        //解决办法一
        StudentFilter studentFilter = new StudentFilter();
        List<Student> students1 = studentFilter.filterByAge(students);
        students1.forEach(student -> System.out.println(student));
        //解決辦法二
        StudentFilterOptimizer studentFilterOptimizer = new StudentFilterOptimizer();
        List<Student> students2 = studentFilterOptimizer.getStudents(students, new FilterByAge());
        students2.forEach(student -> System.out.println(student));

    }
}
