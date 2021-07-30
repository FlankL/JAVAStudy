package com.flank.jvm;

/**
 * @author flank
 * @date 2021/2/22 9:51
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        // 获得系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获得扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);

        //获得引导类加载器，
        ClassLoader parent = extClassLoader.getParent();
        System.out.println(parent);//null,因为引导类加载器是C++写的

        //获得引导类加载器的加载的路径
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println(classLoader);//null,证明是引导类加载器


    }
}
