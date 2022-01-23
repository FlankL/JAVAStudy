package com.flank.javastudy.jdk8stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Streams的练习题
 *
 * @author flank
 * @date 2020/11/24 13:52
 */
public class StreamPractice {
    /**
     * 获取交易记录
     *
     * @return 交易记录的List
     */
    public Stream<Transaction> getTransaction() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        return transactions.stream();
    }

    /**
     * (1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
     */
    @Test
    public void test1() {
        List<Transaction> collect = getTransaction()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

    }

    /**
     * (2) 交易员都在哪些不同的城市工作过？
     */
    @Test
    public void test2() {
        getTransaction().map(Transaction::getTrader).map(Trader::getCity).distinct().forEach(System.out::println);
    }

    /**
     * (3) 查找所有来自于剑桥的交易员，并按姓名排序。
     */
    @Test
    public void test3() {
        getTransaction()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName)).distinct().forEach(System.out::println);

    }
    /**

     * (4) 返回所有交易员的姓名字符串，按字母顺序排序。
     */
    @Test
    public void test4() {
        getTransaction().map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName).reversed())
                .map(Trader::getName)
                .distinct().forEach(System.out::println);

    }

    /**
     * (5)有没有交易员是在米兰工作的？
     */
    @Test
    public void test5(){
        boolean milan = getTransaction().map(Transaction::getTrader)
                .anyMatch(trader -> trader.getName().equals("Milan"));
    }


}
