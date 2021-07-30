package com.flank.classloader;

import java.lang.reflect.Method;

/**
 * @author flank
 * @date 2021/3/22 10:18
 */
public class MyClassLoaderTest {
    public static void main(String[] args) {
        MyClassLoader myClassLoader = new MyClassLoader("D:\\IdeaWorkSpace\\JavaStudy\\target\\classes\\com\\flank\\classloader\\");
        try {
            Class<?> userClass = myClassLoader.findClass("User");
            Object user = userClass.newInstance();
            Method hello = userClass.getMethod("hello");
            hello.invoke(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
