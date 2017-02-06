package com.arrays.geeks4geeks;

import java.util.HashMap;

/**
 * Created by archithrapaka on 8/25/16.
 */
public class FindSubArrayWithGivenSum {

    // naive solution o(n^2)
    public static void subArraySum(int[] a , int sum){
        int cur_sum = 0 , i , j;
boolean found = false;

        for (i = 0; i < a.length; i++) {
                cur_sum = a[i];
            for ( j = i+1; j <= a.length; j++) {
                    if (cur_sum == sum){
                        int p = j-1;
                        System.out.println("sum found between indexes" + i + "and" + p);
                        found = true;
                    }

                   if(cur_sum > sum || j == a.length){
                       break;
                   }
                cur_sum += a[j];
            }
        }
         if (!found){
             System.out.println("No subarrays found for the given sum");
         }
    }

    public static void subArraySumSecond(int[] a, int sum){
        boolean found = false;
        int curr_sum = a[0],start = 0,i;

        for (i = 1; i <= a.length; i++) {
               while (curr_sum > sum && start < i-1){
                   curr_sum = curr_sum - a[start];
                   start++;
               }

            if (curr_sum == sum) {
                found = true;
                int p = i-1;
                System.out.println("sum found between indexes  " + start + " and " + p);
            }
             if (i < a.length){
                 curr_sum = curr_sum + a[i];
             }
        }

        if (!found){
            System.out.println("No subarrays found");
        }

    }

    public static void findSubArrayWithGiven(int[] a, int sum){
        HashMap<Integer,Integer> map = new HashMap<>();
        int curr_sum = 0;

        for (int i = 0; i < a.length; i++) {
             curr_sum = curr_sum + a[i];

            if(curr_sum == sum ){
                 System.out.println("sum sub array found between indexes :" + 0 + "and" + i);
             }

             if (map.containsKey(curr_sum-sum)){
                System.out.println("sum sub array found between indices :" + (map.get(curr_sum-sum) + 1)+ "and" + (i));
            }

            map.put(curr_sum,i);
        }
    }
    public static void main(String...args){
           int[] a = {4,10,-6,-4,0,2,3,-5,1,0,2};
           //subArraySumSecond(a,23);
        findSubArrayWithGiven(a,0);
    }
}
