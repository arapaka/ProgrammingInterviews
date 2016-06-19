package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 6/16/16.
 * Segregate 0s and 1s in an array
 * You are given an array of 0s and 1s in random order.
 * Segregate 0s on left side and 1s on right side of the array.
 * Traverse array only once
 */
public class SegregateZerosAndOnes {


    // count all zeros , let it be c , fill first c by 0's and remaining n-c by 1's

    static void segregate(int[] a){
        int count = 0;

        // count # of zeros
        for (int i:a
             ) {
              if (i == 0){
                  count++;
              }
        }
        int j;
        // fill the first entries to zeros
        for ( j = 0; j < count; j++) {
            a[j] = 0;
        }

        // fill remaining entries with 1's
        for (j = count; j < a.length; j++) {
            a[j] = 1;
        }
    }

    static void segregateOnePass(int[] a){
        int left = 0;
        int right = a.length-1;

        // one pass through the array
        while (left < right){
               while (a[left] == 0 && left < right){
                   left++;
               }
            while (a[right] == 1 && left < right){
                right--;
            }
            if (left < right){
                a[left] = 0;
                a[right] = 1;
                left++;
                right--;
            }
        }

    }


    public static void main(String...args){
          int[] a = {1,0,1,0,1,0,0};
        //segregate(a);
        segregateOnePass(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
