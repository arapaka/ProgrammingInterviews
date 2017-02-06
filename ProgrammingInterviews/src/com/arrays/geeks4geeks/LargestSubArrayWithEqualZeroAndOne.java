package com.arrays.geeks4geeks;

import java.util.HashMap;

/**
 * Created by archithrapaka on 9/8/16.
 * Given an array containing only 0s and 1s,
 * find the largest subarray which contain equal no of 0s and 1s. Expected time complexity is O(n).
 */
public class LargestSubArrayWithEqualZeroAndOne {

    // naive o(n^2)
    static void getSubarray(int[] a) {
        int sum = 0;
        int maxsize = -1;
        int startindex = 0;
        int endindex = 0;
        int j = 0;

        for(int i = 0; i < a.length-1;i++){
             sum = (a[i] == 0)? -1: 1;

            for ( j = i+1; j < a.length; j++) {
                   if(a[j] == 0){
                       sum += -1;
                   } else {
                       sum += 1;
                   }
                if (sum == 0 && maxsize < j-i+1){
                    maxsize = j-i+1;
                    startindex = i;
                }
            }

        }
        endindex = startindex+ maxsize-1;
        if (maxsize == -1){
            System.out.println("No such subarray");
        } else {
            System.out.println(startindex+"  to  " + endindex);
        }
    }

    static void getSubarrayEqualZeros(int[] a){
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        int max_len = 0;
        int end_index = -1;
        int start_index = 0;
        int n = a.length;

        for (int i = 0; i < n; i++)
        {
            a[i] = (a[i] == 0) ? -1 : 1;
        }

        for (int i = 0; i < n; i++) {
             sum += a[i];

             if(sum == 0){
                 max_len = i+1;
                 end_index = i;


             }

            if (map.containsKey(sum+n)){
                  if(max_len < i-map.get(sum+n)){
                      max_len = i-map.get(sum+n);
                      end_index = i;
                  }
            } else {
                map.put(sum+n,i);
            }
        }
        for (int i = 0; i < n; i++)
        {
            a[i] = (a[i] == -1) ? 0 : 1;
        }

        int end = end_index - max_len + 1;
        System.out.println(end + " to " + end_index);

    }
    public static void main(String...args){
        int arr[] = {1, 0, 0, 1, 0, 1, 1};
        getSubarray(arr);
    }
}
