package com.flank.classloader;

import java.io.*;

/**
 * 自定义ClassLoader
 *
 * @author flank
 * @date 2021/3/22 10:18
 */
public class MyClassLoader extends ClassLoader {
    private String path;

    public MyClassLoader(String path) {
        this.path = path;
    }

    public MyClassLoader(ClassLoader parent, String path) {
        super(parent);
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        //获取字节码文件的完整路径
        BufferedInputStream bis = null;
        ByteArrayOutputStream baos = null;//写到内存中，的一个字节数组中。
        try {
            String fileName = path + className + ".class";
            //1.建立连接通道
            bis = new BufferedInputStream(new FileInputStream(new File(fileName)));
            baos = new ByteArrayOutputStream();
            //2.开始读写
            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                baos.write(bytes, 0, len);
            }
            //3.获取内存中的完整字节数据。
            byte[] bytes1 = baos.toByteArray();
            //4.将字节数组的数l据转换为Class的实例
            Class<?> aClass = defineClass(null, bytes1, 0, bytes1.length);
            return aClass;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (baos!=null) {
                    baos.close();
                }
                if (bis!=null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
