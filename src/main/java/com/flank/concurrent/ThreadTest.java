package com.flank.concurrent;

import java.util.Scanner;

/**
 * @author flank
 * @date 2021/3/29 15:48
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {

            Scanner scanner = new Scanner(System.in);
            String next = scanner.next();
        });
        thread.setName("flank_thread_0");
        thread.start();
    }
}
