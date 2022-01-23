package com.flank.liststudy;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author flank
 * @date 2021/6/3 10:39
 */
public class TreeMapTest {
    static class Student{
        String name;
        Integer age;
        public Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("小王", 10);
        Student student2 = new Student("小花", 11);
        Student student3 = new Student("小李", 12);
        Student student4 = new Student("小张", 13);
        Student student5 = new Student("小三", 14);

        TreeMap<Student, Integer> map = new TreeMap<>((o1,o2)->o1.age>o2.age?-1:1);
        map.put(student1, 1);
        map.put(student2, 2);
        map.put(student3, 3);
        map.put(student4, 4);
        map.put(student5, 5);

        map.forEach((k,v)-> {System.out.println(k+":"+v);});
    }
}
