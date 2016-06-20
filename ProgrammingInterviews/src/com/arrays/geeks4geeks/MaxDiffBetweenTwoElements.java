package com.arrays.geeks4geeks;

/**
 * http://www.geeksforgeeks.org/maximum-difference-between-two-elements/
 * Created by archithrapaka on 6/19/16.
 * Given an array arr[] of integers, find out the difference between any
 * two elements such that larger element appears after the smaller number in arr[].

 Examples: If array is [2, 3, 10, 6, 4, 8, 1] then returned value
 should be 8 (Diff between 10 and 2). If array is [ 7, 9, 5, 6, 3, 2 ]
 then returned value should be 2 (Diff between 7 and 9)


 */
public class MaxDiffBetweenTwoElements {

    // time complexity is O(n^2)
    static void printMaxDiff(int[] a){

         if(a.length < 2){
             throw new IllegalArgumentException("Please specify an array with length greater than 2");
         }

        int max_diff = a[1] - a[0];

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                  if (a[j] - a[i] > max_diff){
                      max_diff = a[j] - a[i];
                  }
            }
        }
        System.out.print(max_diff);
    }

    // time complexity O(n) , aux space O(1)
    static void printMaxDiffByMinElement(int[] a){
         if (a.length < 2){
             throw new IllegalArgumentException("The array length has to be more than 2 elements");
         }
        int min_element = a[0];
        int max_diff = a[1] - a[0];

        for (int i = 1; i < a.length; i++) {
              if (a[i] - min_element > max_diff){
                  max_diff = a[i]- min_element;
              }
             if (min_element > a[i]){
                 min_element = a[i];
             }
        }
        System.out.println(max_diff);
    }

    static void printMaxFromRight(int[] a){
        int maxDiff = -1;
        int max_Right = a[a.length-1];

        for (int i = a.length-2; i >=0 ; i--) {
              if (max_Right < a[i]){
                  max_Right = a[i];
              } else {
                  if (max_Right - a[i] > maxDiff){
                      maxDiff = max_Right - a[i];
                  }
              }
        }
        System.out.println(maxDiff);
    }


    public static void main(String...args){
        int[] a = {2, 3, 10, 6, 4, 8, 1};
        //printMaxDiff(a);
        //printMaxDiffByMinElement(a);
        printMaxFromRight(a);
    }
}
