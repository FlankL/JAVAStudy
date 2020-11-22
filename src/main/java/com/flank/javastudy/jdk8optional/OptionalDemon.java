package com.flank.javastudy.jdk8optional;

import java.util.Optional;
import java.util.function.Function;

/**
 * @author: flank
 * @date: 2020/11/22
 * @description:
 */
public class OptionalDemon {
    /**
     * 1.创建Optional对象
     */
    public void createOptional() {
        //声明一个空的Optional对象
        Optional<Address> optionalAdress = Optional.empty();
        //依据一个非空值创建Optional，如果new Adress为空依然会抛出空指针异常
        Optional<Address> optionalAdress1 = Optional.of(Address.builder().build());
        //可接受Null的Optional
        Optional<Address> optionalAdress2 = Optional.ofNullable(Address.builder().build());
    }

    /**
     * 2. 用来获取Optional包裹的对象的属性值,提取和转换
     */
    public void optionalMap(){
        Optional<Address> optionalAdress = Optional.of(Address.builder().build());
        optionalAdress.map(Address::getName);
    }

    /**
     * 3.获取关联的Optional属性值
     */
    public void flatMap(){
        //创建一个User对象
        User user = User.builder().build();
        //将User对象用Optional包裹
        Optional<User> optionalUser = Optional.ofNullable(user);
        Optional<String> s = optionalUser.flatMap(User::getOptionalAdress).map(Address::getName);
    }

    /**
     * 4.设置属性的默认值
     */
    public void setFieldDeafult(){

    }






}
