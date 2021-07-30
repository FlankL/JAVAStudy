package com.flank.jvm;

/**
 * @author flank
 * @date 2021/3/9 10:17
 */
public class StringIntern1 {
    public static void main(String[] args) {
        String s = new String("1");//s指向的new出来的对象的地址
        s.intern();//调用此方法之前，字符串常量池中已经存在“1”
        String s2 = "1";//将字符串常量池中“1”的地址给s2
        System.out.println(s == s2);//jdk6:false  jdk7/8:false

        String s3 = new String("1") + new String("1");//s3变量记录的地址是new String("11")
        //在执行完上面的语句后，字符串常量池中没有“11”对象
        s3.intern();//在字符串常量池中创建“11”。如何理解：jdk6:创建了一个新的对象“11”，也就有新的地址。
                    //                 jdk7/8:(为了节省堆内存空间)此时常量池中并没有创建“11”.而是创建了一个指向堆空间中new String("11")的地址
        String s4 = "11";//s4记录的地址是常量池中生成的"11"的地址。
        System.out.println(s3 == s4);//jdk6:false  jdk7/8:true

    }
}
