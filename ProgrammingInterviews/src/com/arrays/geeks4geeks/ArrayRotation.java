package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 6/15/16.
 * Program for array rotation
 Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 */
public class ArrayRotation {

    static void rotateByDelements(int[] a,int d){
        // reverse the first part till d elements
        ReverseArray.reverseArray(a,0,d-1);
        // reverse the entire array
        ReverseArray.reverseArray(a,0,a.length-1);
        // reverse the second half after d elements to get the rotation

        ReverseArray.reverseArray(a,0,a.length-1-d);
    }

    public static void main (String...args){
        int [] a = {1,2,3,4,5,6,7};
        rotateByDelements(a,3);

        for (int i:a
             ) {
             System.out.println(i);
        }
    }
}
