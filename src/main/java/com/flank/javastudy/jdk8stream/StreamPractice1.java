package com.flank.javastudy.jdk8stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 *
 * @author flank
 * @date 2020/11/23 14:18
 */
public class StreamPractice1 {
/**
 * 2.
 * <p>
 * 2.1 给定一个数字列表，如何返回一个由每个数的平方构成的列表呢？
 * 例如，给定[1, 2, 3, 4, 5]，应该返回[1, 4, 9, 16, 25]
 * <p>
 * 2.2 给定两个数字列表，如何返回所有的数对呢？例如，给定列表[1, 2, 3]和列表[3, 4]，
 * 应该返回[(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]。
 * 为简单起见，你可以用有两个元素的数组来代表数对。
 * <p>
 * 2.3 如何扩展前一个例子，只返回总和能被3整除的数对呢？例如(2, 4)和(3, 3)是可以的。
 */
    @Test
    public void test1(){
        Stream.of(1,2,3,4,5).map(n->n*n).forEach(System.out::println);
    }
    @Test
    public void test2(){
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3,4);
        List<int[]> collect = numbers1.stream()
                .flatMap(i -> numbers2.stream().map(j -> new int[]{i, j}))
                .collect(Collectors.toList());


    }


}
