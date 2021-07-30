package com.flank.classloader;

import sun.misc.Launcher;

import java.net.URL;

/**
 * -XX:+TraceClassLoading
 * @author flank
 * @date 2021/3/19 14:28
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        System.out.println("启动类加载器");
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }
    }
}
