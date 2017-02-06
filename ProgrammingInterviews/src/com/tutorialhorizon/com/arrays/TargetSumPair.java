package com.tutorialhorizon.com.arrays;

import java.util.Arrays;

/**
 * Created by archithrapaka on 10/18/16.
 */
public class TargetSumPair {

    public static void printSumPairs(int[] a , int sum){
        // cost of this is o(logn )
        Arrays.sort(a);

        int start = 0;
        int end = a.length-1;

        boolean found = false;
        while (start != end){
                  if(a[start] + a[end] == sum){
                      found = true;
                      System.out.print("the pair is :" + "("+a[start] + "," +a[end] + ")");
                      start++;
                      end--;
                  }
               else if(a[start] + a[end] > sum){
                   end--;
               }
            else {
                   start++;
               }
        }
        if (!found){
            System.out.println("no such pairs found");
        }
    }

    public static void main(String...args){
        int[]a = {1, 2, 3, 4, 5,6,7,16, 17, 18, 19, 249};
        printSumPairs(a,8);
    }
}
