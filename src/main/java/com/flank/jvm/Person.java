package com.flank.jvm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * list的remove方法删除完之后，元素的index会变动
 * https://blog.csdn.net/zhaoyong2008bj/article/details/78685634
 * //1.for
 * //优点：效率最高，遍历快，可以根据自定计数器操作元素
 * //缺点：不适用所有集合，每次都需要在应用程序中手动强转和额外的获得list.size,还有一个缺点就是遍历过程中不允许删除元素
 * for (int i = 0; i < li.size(); i++) {
 * System.out.println(li.get(i));
 * }
 *
 *
 * //2.迭代器
 * // 优点：迭代器提供了操作元素的方法 可以在遍历中相应地操作元素
 * //缺点：运行复杂，性能稍差，效率相对其他两种遍历方式较低
 * Iterator<String> it = li.iterator();
 * while(it.hasNext()){
 * System.out.println(it.next());
 * }
 *
 * //3.Foreach
 * //优点：代码简洁，不易出错。
 * //缺点：只能做简单的遍历，不能在遍历过程中操作（删除、替换）数据集合。
 * for (String s : li) {
 * System.out.println(s);
 * }
 * @author flank
 * @date 2021/1/28 10:45
 */
public class Person {
    public static void main(String[] args) throws Exception {
        List list = Stream.of(1,2,3,4,5).collect(Collectors.toList());
        List copy = DeepCopy.copy(list);


        //实现方式一
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals(1)) {
//                copy.remove(i);
//            } else if (list.get(i).equals(2)) {
//                System.out.println(2);
//            } else if (list.get(i).equals(3)) {
//                System.out.println(3);
//            }
//        }
        
        // 实现方式二
        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().equals(1)) {
//                iterator.remove();
//            } else if (iterator.next().equals(2)) {
//                iterator.remove();
//            }
//        }

        //实现方式三
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(1)) {
                list.remove(i);
                i=i-1;
            } else if (list.get(i).equals(2)) {
                list.remove(i);
                i=i-1;
            } else if (list.get(i).equals(3)|list.get(i).equals(4)) {
                list.remove(i);
                i=i-1;
            }
        }

        list.forEach(t-> System.out.println("t = " + t));
    }
}