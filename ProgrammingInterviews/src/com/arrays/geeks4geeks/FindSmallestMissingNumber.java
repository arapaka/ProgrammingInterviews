package com.arrays.geeks4geeks;

import java.util.Arrays;

/**
 * Created by archithrapaka on 6/26/16.
 * Given a sorted array of n integers where each integer is in the range from 0 to m-1 and m > n.
 * Find the smallest number that is missing from the array.
 * input is sorted ....
 */
public class FindSmallestMissingNumber {

    //method 1
    static void printSmallestNumber(int[] a,int m){
        // o(m*logn)
        for (int i = 0; i < m; i++) {
                if (Arrays.binarySearch(a,i) == -1){
                    System.out.print("The smallest missing number is :" + i);
                }
        }
    }

    //method 2..Linear search O(n)
    static void printSmallest(int[] a,int m){
        int i,j = 1;

        for ( i = 0; i < a.length; i++) {
               if(j > a.length) {
                   break;
               }
                 if(a[j]- a[i] > 1){
                     System.out.print("the missing number is :" + a[i]+1);
                 } else {
                     j++;
                     i++;
                 }
        }

    }

    // doesn't work for duplicates...o(logn)
    static int findFirstMissing(int[] a, int start,int end){
         if(start > end){
             return end+1;
         }
        if (start != a[start]){
            return start;
        }
        int mid = (start+end)/2;

        if (a[mid] > mid)
            return findFirstMissing(a,start,mid);
         else
            return findFirstMissing(a,mid+1,end);

    }

    static int findMissing(int[]a , int start , int end){

            if(start == end){
                return end;
            }
             int mid = (start+end)/2;
         if(a[mid] > mid){
             return findMissing(a,start,mid);
         } else {
             return findMissing(a,mid+1,end);
         }

    }

    public static void main(String...args){



        int[] a = {0,1,3,4,5,6,7,8,9,10};
        //int missing = findFirstMissing(a,0,10);
        int missing = findMissing(a,0,10);
        System.out.print(missing);
    }
}
