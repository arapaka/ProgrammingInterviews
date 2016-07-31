package com.arrays.geeks4geeks;

import java.util.Arrays;

/**
 * Created by archithrapaka on 7/31/16.
 */
public class CheckIfArrayElementsAreConsecutive {


    //o(nlogn)...
    public static boolean checkBySorting(int[] a){
        Arrays.sort(a);
        int j=1;
        for (int i = 0; i < a.length; i++) {
               if(j >= a.length)break;
            if(a[j]- a[i] !=1){
                return false;
            } j++;
        }
       return true;
    }


    // method 2 .. o(n) .. no sorting ..

    public static boolean checkConsecutive(int[] a){
        int min = getMin(a);
        int max = getMax(a);
        int n = a.length;

        if (max - min + 1 == n){
            for (int i = 0; i < n; i++) {
                      int j;
                if (a[i] < 0){
                    j = -a[i]- min;
                } else
                    j = a[i] - min;

                // if the value at index j is negative then
                // there is repitition
                if (a[j] > 0){
                    a[j] = - a[j];
                } else {
                    return false;
                }
            }

            return true;
        }
        return false;
    }

    public static int getMax(int[] a){
        int max  = a[0];

        for (int i = 1; i < a.length; i++) {
             if (a[i] > max){
                 max = a[i];
             }
        }
        return max;
    }

    public static int getMin(int[] a){
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
             if(a[i] < min){
                 min = a[i];
             }
        }
        return min;
    }


    public static void main(String[] args){
               int[] a = {34, 23, 52, 12, 3};
              System.out.println(checkBySorting(a));
              System.out.println(checkConsecutive(a));
    }
}
