package com.flank.javastudy.jdk8optional;


import org.junit.Test;

import java.util.Optional;
import java.util.Properties;

/**
 * @author flank
 * @date 2020/11/22 14:21
 */
public class OptionalDemon {
    /**
     * 1.创建optional对象
     */
    public void createOptional(){
        //创建一个空的Optional对象
        Optional<User> userOptional = Optional.empty();
        //创建方式2，如果User为空，会抛出空指针异常
        Optional<User> userOptional1 = Optional.of(User.builder().build());
        //创建方式3,如果User为空，会直接创建一个什么都没有包裹的Optional对象
        Optional<User> userOptional2 = Optional.ofNullable(User.builder().build());
    }

    /**
     * 2.获取Optional包裹对象的属性值
     */
    public void getFieldFromOptional(){
        Adress address = Adress.builder().name("上海").build();
        Optional<Adress> adressOptional = Optional.ofNullable(address);
        Optional<String> s = adressOptional.map(Adress::getName);
        System.out.println("s = " + s);
    }
    /**
     * 3.获取两个Optional对象关联的属性值
     */
    @Test
    public void getField(){
        Optional<User> user = Optional.ofNullable(User.builder()
                .name("Tom")
                .optionalAdress(Optional.of(Adress.builder().name("上海").build()))
                .build());
        Optional<String> s = user.flatMap(User::getOptionalAdress).map(Adress::getName);
        System.out.println("s = " + s);
    }
    /**
     *4.当属性为空时设置默认值
     */
    @Test
    public void setFIeldDeafult(){
        Adress address = Adress.builder().name(null).build();
        Optional<Adress> adressOptional = Optional.ofNullable(address);
        //当获取属性值为null时，返回默认值orElse
        String s = adressOptional.map(Adress::getName).orElse("北京");
        System.out.println("s = " + s);
    }
    /**
     * 5.filter
     */
    @Test
    public void testFilter(){
        Optional<User> user = Optional.ofNullable(User.builder()
                .name("Tom")
                .optionalAdress(Optional.of(Adress.builder().name("上海").build()))
                .build());
        //获取属性的值并判断属性值是包含上。
        boolean present = user.flatMap(User::getOptionalAdress)
                .filter(address -> address.getName().contains("上"))
                .isPresent();
        System.out.println("present = " + present);
    }

    public int readPoint(Properties props, String name) {
        String value = props.getProperty(name);
        //确保名称对应的属性存在
        if (value != null) {
            try{
                //将String类型转换为Int类型
                int i = Integer.parseInt(value);
                //检查返回的数字是否是正数
                if (i > 0) {
                    return i;
                }
            }catch (NumberFormatException nfe){}
        }
        //如果条件不满足返回0
        return 0;
    }
    public int readPoint2(Properties props, String name) {
        //使用optinal使代码有了流式的感觉
        //所谓流就是将一些数据，通过不同的功能函数加工处理，最后得到需要所需值的过程。将数据扁平化处理
        return Optional.ofNullable(props).map(properties -> properties.getProperty(name))
                .map(Integer::parseInt)
                .filter(i -> i > 0)
                .orElse(0);
    }




}
