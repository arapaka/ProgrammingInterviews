package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/24/16.
 */
public class SegregateNumbersArray {

    public static int[] partitionArray(int[] a , int start , int end){

        while (start <= end){
            // partitioning by even and odd numbers , increment pointer if it is even
            while (a[start] % 2 == 0){
                    start++;
                }
            while (a[end] % 2 == 1){
                end--;
            }

            if(start <= end){
                swap(a,start,end);
                start++;
                end--;
            }
        }
        return a;

    }

    public static void swap(int[] a , int start , int end){
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }

    public static void main(String...args){
        int [] a = {12, 34, 45, 9, 8, 91, 3};
        int[] part = partitionArray(a,0,6);
    }
}
