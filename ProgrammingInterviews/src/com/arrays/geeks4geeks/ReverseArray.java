package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 6/15/16.
 * Write a program to reverse an array or string
 * http://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
 */
public class ReverseArray {

    static void reverseArray(int[] a,int start,int end){
        int temp;

        while (start < end){
            temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
        }
    }

    static void reverseArrayRecursive(int[]a ,int start,int end){
        int temp;

        if(start >= end){
            return;
        }
        // else call recursively this function

        temp = a[end];
        a[end] = a[start];
        a[start] = temp;
        reverseArrayRecursive(a,start+1,end-1);

    }

    public static void main(String...args){
        int [] a = {1,2,3,4,5};
        reverseArrayRecursive(a,0,4);

        for (int i:a
             ) {
             System.out.print(i +",");
        }
    }
}
