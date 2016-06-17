package com.arrays.geeks4geeks;

import java.util.Arrays;

/**
 * Created by archithrapaka on 6/16/16.
 * Check for Majority Element in a sorted array
 * Write a function to find if a given integer x appears more than n/2 times in a sorted array of n integers.
 */
public class MajorityElementSortedArray {


    //Linearly search for the first occurrence of the element, once you find it (let at index i),
    // check element at index i + n/2. If element is present at i+n/2 then
    // return true else return false.
    static boolean checkMajorityNumber(int[] a,int x){
        int n = a.length;


        for ( int i = 0; i < a.length; i++) {
                  if((i+n/2) <= n-1 && a[i] == x && a[i+ n/2] == x){
                      return true;
                  }
        }
        return false;
    }


    // best method , whenever the array is sorted , think in terms of Binary search
    //Use binary search methodology to find the first occurrence of the given number.
    // The criteria for binary search is important here. time complexity is o(logn)

    static boolean checkMajorityBinarySearch(int[] a,int x){

        int i = Arrays.binarySearch(a,x);

        if(i == -1){
            return false;
        }
        int n = a.length;
        if (i+n/2 <= n-1 && a[i] == x && a[i+n/2] == x){
            return true;
        }
        return false;
    }

    public static void main(String...args){
        int arr[] = {1, 1, 1, 2, 2}; int x = 1;
            System.out.println(checkMajorityNumber(arr,x));
    }
}
