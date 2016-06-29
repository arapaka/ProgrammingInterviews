package com.arrays.geeks4geeks;

import java.util.Arrays;

/**
 * Created by archithrapaka on 6/29/16.
 *
 */
public class MaxValueKArrayHasKElements {

    // only if the number is present in the array
   static int findNumber(int[] a){
       int count = 0;
       // sort the arrays
       Arrays.sort(a);

       int rightmax = a.length;
       int k = 0;
       int[] dp = {0};

       for (int i = 0; i <rightmax; i++) {

                k = rightmax - (i); // count of elements on the right ...

                if (k >= a[i]){
                    dp[0] = a[i];
                    count++;
                }
       }

       return dp[0];
   }


    static int findMaximumNum(int[] a){
        int n = a.length;
        int[] freq = new int[n+1];

        for (int i = 0; i < n; i++) {
                 if (a[i] < n){
                     freq[a[i]]++;
                 } else {
                     freq[n]++;
                 }
        }

        // sum stores number of elements in input array
        // that are greater than or equal to current
        // index
        int sum = 0;

        for (int i = n; i > 0; i--) {
            sum += freq[i];
             if(sum >= i){
                 return i;
             }
        }
        return -1;
    }


    public static void main(String[] args){
        int[] a = {6,7,9,8,10};
        //System.out.print(findNumber(a));
        System.out.print(findMaximumNum(a));
    }
}
