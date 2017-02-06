package com.tutorialhorizon;

import java.util.Arrays;
import java.util.List;

/**
 * Created by archithrapaka on 10/16/16.
 */
public class ArrayElementsConsecutive {

    static boolean checkifConsecutive(Integer[] a){
        Integer[] minMax = getMinOrMax(a);
        int min = minMax[0];
        int max = minMax[1];

        for (int i = min; i < max; i++) {
                 if(Arrays.asList(a).indexOf(i) < 0){
                     System.out.print(a[i] + ", is missing");
                     return false;
                 }
        }
        System.out.println("Array Elements are consecutive from " + min + " to " + max);
        return true;
    }

    public static Integer[] getMinOrMax(Integer[] a ){
        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
                if(a[i] > max){
                    max = a[i];
                }
            if(a[i] < min){
                min = a[i];
            }
        }
       Integer[] minMax = {min,max};
        return minMax;
    }
    public static void main(String...args){
        Integer a[] = {21,24,22,26,23,25};
        checkifConsecutive(a);
         List<Integer> list = Arrays.asList(a);
       // System.out.println(list.indexOf(21));
    }
}
