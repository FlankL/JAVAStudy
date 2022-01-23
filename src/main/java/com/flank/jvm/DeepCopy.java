package com.flank.jvm;

import java.io.*;

/**
 * @author flank
 * @date 2021/2/4 11:11
 */
public class DeepCopy {
    /**
     * 深层拷贝
     *
     * @param <T>
     * @param obj
     * @return
     * @throws Exception
     */
    static <T> T copy(T obj) throws Exception {
        //是否实现了序列化接口，即使该类实现了，他拥有的对象未必也有...
        if (Serializable.class.isAssignableFrom(obj.getClass())) {
            //如果子类没有继承该接口，这一步会报错
            try {
                return copyImplSerializable(obj);
            } catch (Exception e) {
                //这里不处理，会运行到下面的尝试json
            }
        }
        return null;
    }

    /**
     * 深层拷贝 - 需要类继承序列化接口
     *
     * @param <T>
     * @param obj
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    private static <T> T copyImplSerializable(T obj) throws Exception {
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;

        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;

        Object o = null;
        //如果子类没有继承该接口，这一步会报错
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(obj);
            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);

            o = ois.readObject();
            return (T) o;
        } catch (Exception e) {
            throw new Exception("对象中包含没有继承序列化的对象");
        } finally {
            try {
                assert baos != null;
                baos.close();
                assert oos != null;
                oos.close();
                assert bais != null;
                bais.close();
                assert ois != null;
                ois.close();
            } catch (Exception e2) {
                //这里报错不需要处理
            }
        }
    }


}


