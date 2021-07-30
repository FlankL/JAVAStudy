package com.flank.javastudy.jdk8lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author flank
 * @date 2021/6/30 15:07
 */
    public class CompareTest {
        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student("a", 1, "a"));
            students.add(new Student("b", 2, "b"));
            students.add(new Student("c", 4, "c"));
            students.add(new Student("d", 3, "d"));

    //        students.sort(((o1, o2) -> o1.getAge()-o2.getAge()));
            students.sort(Comparator.comparing(Student::getAge));
            students.forEach(student -> System.out.println(student.getAge()));
        }
    }
