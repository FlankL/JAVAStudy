package com.flank.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author flank
 * @date 2021/7/30 11:31
 */
public class Exam {
    public static void main(String[] args) {
        int[] arr1={1,4};
        int[] arr2={3,5};
        int[] arr3={8,9};
        List<Integer> arr4 = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            arr4.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            arr4.add(arr2[j]);
        }
        for (int k = 0; k < arr3.length; k++) {
            arr4.add(arr3[k]);
        }
        Integer[] objects = arr4.toArray(new Integer[0]);
//        for (int i = 0; i < objects.length; i++) {
//            for (int i1 = i; i1 < objects.length; i1++) {
//                if (objects[i] > objects[i1]) {
//                    int tmp = objects[i];
//                    objects[i]=objects[i1];
//                    objects[i1]=tmp;
//                }
//            }
//        }
//        for (int i = 0; i < objects.length; i++) {
//            System.out.println(objects[i]);
//        }
    }
}
