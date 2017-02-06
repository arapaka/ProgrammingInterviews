package com.arrays.geeks4geeks;

import java.util.HashMap;

/**
 * Created by archithrapaka on 8/23/16.
 * Find the largest subarray with 0 sum
 Given an array of integers, find length of the largest subarray with sum equals to 0.
 http://www.geeksforgeeks.org/find-the-largest-subarray-with-0-sum/
 */
public class FindLargestSubArrayWithZeroSum {

    // inefficient way , complexity is o(n^2)
    public static void findLargestSubArray(int[] a ){
        int max_len = 0;

        for (int i = 0; i < a.length; i++) {
             int cur_sum = 0;

            for (int j = i; j < a.length; j++) {
                   cur_sum += a[j];

                   if (cur_sum == 0){
                       max_len = Math.max(max_len,j-i+1);
                   }
            }
        }
        System.out.print(max_len);
    }


    public static void findLargestSubArrayWith(int[] a ) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int sum = 0;
        int max_len = 0;

        for (int i = 0; i < a.length; i++) {
             sum += a[i];

            if (a[i] == 0 && max_len == 0){
                max_len = 1;
            }

            if (sum == 0){
                   max_len = i+1;
               }
             if (hmap.containsKey(sum)){
                 max_len = Math.max(max_len,i-hmap.get(sum));
             } else {
                 hmap.put(sum,i);
             }
        }
    }


    public static void main(String...args){
        int[] a = {15, -2, 2, -8, 1, 7, 10, 23};
        findLargestSubArrayWith(a);
    }
}
