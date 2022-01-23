package com.flank.jvm;

/**
 * 方法中定义的变量是否线程安全？看具体情况分析
 * <p>
 * 何为线程安全？
 * 如果只有一个线程可以操作此数据，则一定是线程安全
 * 如果有多个线程可以操作此数据，则此数据是共享数据，则有数据安全问题
 *
 * @author flank
 * @date 2021/2/26 14:26
 */
public class StackThreadTest {

    public void test1() {
        //此时s1是线程安全的，因为在方法内部定义，只有一个线程可以访问
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
    }

    public static StringBuilder s2 = new StringBuilder();

    public static void test2() {
        s2.append("2");
        s2.append("a");
    }

    public static void main(String[] args) {
        //s2是有线程安全问题的，因为他定义在方法外面，可以被多个线程所访问。
        new Thread(() -> {
            s2.append("a");
            s2.append("b");
        }).start();
        test2();

    }

}
