package com.flank.javastudy.jdk8lambda;

/**
 * lambda的四种类型
 *
 * @author flank
 * @date 2020/11/20 11:13
 */

public interface Consumer<T> {
    /**
     * 消费型接口
     *
     * @param t
     */
    void consume(T t);
}

interface Supplier<T> {
    /**
     * 供给型接口
     */
    T supply();
}

interface Function {
    /**
     * 函数型接口
     *
     * @return
     */
    int parse(String str);
}

/**
 * 断言型
 */
interface Predicate<T> {
    boolean predicate(T t);
}


class LambdaMain {

    public static void main(String[] args) {
        //   消费型
        consumeTest(10, money -> System.out.println(money));
        //直接调用，直接写实现体
        Consumer<Integer> consumer = b -> System.out.println(b);
        consumer.consume(12);
        //供给型
        applyTest(() -> 13);

        //函数型
        functionTest("22", str -> Integer.parseInt(str));
        //断言型
        predictTest("java", str -> str == "java");

    }

    public static void predictTest(String str, Predicate<String> predicate) {
        boolean predicate1 = predicate.predicate(str);
        System.out.println(predicate1);
    }

    /**
     * 函数型测试
     *
     * @param str
     * @param function
     */
    public static void functionTest(String str, Function function) {
        int parse = function.parse(str);
        System.out.println("函数型：" + parse);
    }

    /**
     * 供给型测试
     *
     * @param supplier
     */
    public static void applyTest(Supplier<Integer> supplier) {
        Integer tmp = supplier.supply();
        System.out.println("供给型：" + tmp);
    }

    /**
     * 消费型调用测试
     *
     * @param maney
     * @param consumer
     */
    public static void consumeTest(Integer maney, Consumer<Integer> consumer) {
        consumer.consume(maney);
    }


}
