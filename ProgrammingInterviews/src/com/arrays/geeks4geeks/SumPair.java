package com.arrays.geeks4geeks;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by archithrapaka on 6/14/16.
 * link from GeeksforGeeks
 * http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 Write a  program that, given an array A[] of n numbers and another number x,
 determines whether or not there exist two elements in S whose sum is exactly x.
 */
public class SumPair {

    private static final int MAX = 100000; // Max size of Hashmap
    // time complexity o(n*n)
    public static boolean getPairByBruteForce(int[] A,int targetSum){
        if(A.length <= 1 ) return false;

        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j < A.length; j++) {
                 if (A[i]+A[j] == targetSum){
                     return true;
                 }
            }
        }
        return false;
    }

    // Naive way of implementation Extra space o(n) ,Time complexity 0(nlogn), using HashMap

    public static void getPairByBoolean(int[] a,int sum){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int i;

        for ( i = 0; i < a.length; ++i)
            map.put(a[i], sum-a[i]);

        for (i = 0; i < a.length; ++i)
            // contains method in hashmap has a time complexity of o(logn) in worst case , o(1) in average case
            if(map.containsValue(a[i]) && map.get(a[i])!=null)
            {
                System.out.println("("+a[i]+","+map.get(a[i])+")");
                map.remove(a[i]);
            }
    }

    // best Method , Sort the array and do a binary search

    public static void getPairByBinarySearch(int[] a , int sum){
        Arrays.sort(a);
        int start = 0;
        int end = a.length-1;

        while (start != end){
            if(a[start] + a[end] == sum){
                System.out.println("the pair is :("+a[start]+","+a[end]+")");
                start++;
                end--;
            }
            else if (a[start]+a[end] > sum){
                end--;
            }
            else {
                start++;
            }
        }
    }

    // using binary array to find the sum pair

    static void printPairs(int[] arr,int sum){
        boolean[] binmap = new boolean[MAX];

        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];

            // checking for condition
            if (temp>=0 && binmap[temp])
            {
                System.out.println("Pair with given sum " +
                        sum + " is (" + arr[i] +
                        ", "+temp+")");
            }
            binmap[arr[i]] = true;
        }
    }

    public static void main(String...args){
        int[] a = {1,2,3,4,5,6,7};
        getPairByBinarySearch(a,8);
    }
}
