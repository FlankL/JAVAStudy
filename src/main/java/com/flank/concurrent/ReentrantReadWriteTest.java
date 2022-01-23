package com.flank.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 锁降级防止雪崩实例
 * @author flank
 * @date 2021/4/13 9:35
 */
public class ReentrantReadWriteTest {
    //创建一个缓存
    private static Map<Integer, String> map = new HashMap<>();
    //创建一把读写锁
    private static ReadWriteLock lock =new  ReentrantReadWriteLock();

    public static void main(String[] args) {
        //1.创建多个线程执行从缓存中获取数据
        //2.如果缓存中没有数据，则dataBase.query();
        //3.查完之后，则将数据存储到缓存中。
    }

    /**
     * 根据id查询缓存，并返回结果字符串
     * @param id
     * @return
     */
    public String queryCache(Integer id) {
        String value;
        //首先开启读锁，从缓存中去取(为了防止数据不一致，先释放读锁，再加写锁)
        lock.readLock().lock();
        try {
            value = map.get(id);
            if (value == null) {
                //TODO dataBase.query();全部查询数据库，就会导致缓存雪崩
                //必须释放读锁，不然不能加写锁
                lock.readLock().unlock();
                //上写锁，防止多个请求同时查询数据库
                lock.writeLock().lock();
                try {
                    value = map.get(id);
                    //double check,如果缓存中有，则其他线程直接获取。
                    if (value == null) {
                        //如果缓存中没有，则去数据库里面去取。
                    }
                    //写锁降级为读锁，保证数据一致性，在不释放写锁的情况下，直接获取读锁，就是写锁的降级。
                    lock.readLock().lock();
                }finally {
                    //释放了写锁，但是依然存在读锁。
                    lock.writeLock().unlock();
                }
            }
            //操作数据
        }finally {
            //释放读锁
            lock.readLock().unlock();
        }

        return value;
    }
}
