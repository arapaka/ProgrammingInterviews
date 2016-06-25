package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 6/25/16.
 */
public class SegregateEvenAndOddNumbers {

    static void segregateOddAndEven(int[] a){
        int length = a.length;
        int start = 0;
        int end = length-1;

        while(start < end) {
                while (a[start] % 2 == 0 && start < end){
                    start++;
                }
                while (a[end] % 2 == 1 && start < end){
                    end--;
                }
               if (start < end){
                   int temp = a[start];
                   a[start] = a[end];
                   a[end] = temp;
                   start++;
                   end--;
               }
        }

    }

    public static void main(String...args){
        int[] a = {12, 34, 45, 9, 8, 90, 3};

        segregateOddAndEven(a);

        for (int i:a
             ) {
            System.out.print(i + ",");
        }
    }
}
