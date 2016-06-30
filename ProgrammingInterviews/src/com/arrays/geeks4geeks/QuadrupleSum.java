package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 6/29/16.
 * Given an array of integers,
 * find all combination of four elements
 * in the array whose sum is equal to a given value X.
 For example, if the given array is {10, 2, 3, 4, 5, 9, 7, 8} and X = 23,
 then your function should print “3 5 7 8″ (3 + 5 + 7 + 8 = 23).
 */
public class QuadrupleSum {

    // naive 0(n^4) , effectively inefficient
    static void getQuadrupleSum(int[] a, int target){
        int i,j,k,l,n = a.length;

        for (i = 0; i < n-3; i++) {
            for ( j = i+1; j < n-2; j++) {
                  for (k = j+1;k < n-1;k++) {
                      for (l = k+1;l < n;l++){
                            if (a[i]+a[j]+a[k]+a[l] == target){
                                System.out.println("the quadruple is :("+a[i]+","+a[j]+","+a[k]+","+a[l]+")");
                            }
                      }
                  }
            }
        }
    }

    /*
    Following are the detailed steps.
1) Sort the input array.
2) Fix the first element as A[i] where i is from 0 to n–3. After fixing the first element of quadruple,
fix the second element as A[j] where j varies from i+1 to n-2. Find remaining two elements in O(n) time using Sumpair

    */

    static void getQuadrupleEffective(int[] a,int target){
         int i,j,l,r,n=a.length;
        for (i = 0; i < n-3; i++) {
            for (j = i+1;j < n-2;j++){
                l = j+1;
                r = n-1;
                while (l < r){
                     if(a[i] + a[j] + a[l]+a[r]== target){
                         System.out.println("the quadruple is :("+a[i]+","+a[j]+","+a[l]+","+a[r]+")");
                         l++;
                         r--;
                     } else if (a[i] + a[j] + a[l]+a[r] < target){
                         l++;
                     } else {
                         r--;
                     }
                }
            }
        }
    }

    public static void main(String...args){
        int[] a = {10, 2, 3, 4, 5, 9, 7, 8};
        ///getQuadrupleSum(a,23);
        getQuadrupleEffective(a,23);
    }
}
