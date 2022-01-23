package com.flank.concurrent;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author flank
 * @date 2021/4/14 15:21
 */
public class AtomicRefereceDemon {
    public static void main(String[] args) {
        User user = new User("张三", 20);
        AtomicReference<User> userAtomic = new AtomicReference<>();
        userAtomic.set(user);
        User updateUser = new User("李四", 20);
        userAtomic.compareAndSet(user, updateUser);
        System.out.println(userAtomic.get());
    }
}
class User{
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
