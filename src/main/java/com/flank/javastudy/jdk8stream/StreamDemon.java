package com.flank.javastudy.jdk8stream;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * 练习Stream
 * @author flank
 * @date 2020/11/23 10:56
 */
public class StreamDemon {

    /**
     * 1.创建流对象
     */
    @Test
    public void testCreateStream(){
        //创建集合流
        List<String> list = Arrays.asList("hello", "world");
        Stream<String> stream = list.stream();
        //通过数组创建流
        int[] arr = {1, 2, 3};
        IntStream stream1 = Arrays.stream(arr);
        //通过值创建
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        //通过Iterator创建无限流
        Stream.iterate(0,n->n+2)
                .limit(10)
                .forEach(System.out::print);

    }
    /**
     * 2.使用Filter
     */
    @Test
    public void testFilter(){
       Stream.iterate(0,n->n+1)
               .filter(n->n%2==0)
               .limit(10)
               .forEach(System.out::println);
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 2, 4, 4);
        integerStream.distinct().skip(2).map(integer -> integer+"").forEach(n->{
            System.out.println(n);
            System.out.println(n instanceof String);//判断是否是String类型
        });
    }
    /**
     * 3.使用flatmap合并流
     */
    @Test
    public void testFlatMap(){
        List<String> list = Arrays.asList("I am a boy", "I am gir");
        list.stream().map(word->word.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
    }
    /**
     * 4.使用规约
     */
    @Test
    public void testReduce(){
        Integer reduce = Stream.of(1, 2, 3, 4)
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
        int sum = Stream.of(1, 2, 3, 4).mapToInt(value -> value).sum();
        System.out.println(sum);

    }
    /**
     * 5.使用Collecting收集器
     */
    @Test
    public void testCollecting(){
        long count = Stream.of(1, 2, 3, 4, 5).count();
        System.out.println(count);
        Optional<Integer> max = Stream.of(1, 2, 3, 4, 5).max(Integer::compareTo);
        System.out.println("max = " + max);


    }

    @Test
    public void tesetStream(){
        List<String> list = new ArrayList<String>();
        list.add("I am a boy");
        list.add("I love the girl");
        list.add("But the girl loves another girl");
        list.stream().map(item->item.split(" ")).flatMap(Arrays::stream).forEach(System.out::println);
    }

    @Test
    public void testCompare(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("zhangsna", 10));
        students.add(new Student("lisi", 13));
        students.add(new Student("wangwu", 11));
        // students.sort(new Comparator<Student>() {
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return 0;
        //     }
        // });
        students.sort(Comparator.comparing(Student::getAge));
    }

    class feibo{
        public int first;
        public int second;

        public feibo(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "feibo{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }
    @Test
    public void testFeibo(){
        Stream.iterate(new feibo(0,1),feibo ->
             new feibo(feibo.second,feibo.first+ feibo.second))
                .limit(20)
                .forEach(feibo -> System.out.println("("+feibo.first+","+feibo.second+")"));

    }



}
