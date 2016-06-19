package com.arrays.geeks4geeks;

import java.util.Arrays;

/**
 * Created by archithrapaka on 6/18/16.
 * Union and Intersection of two sorted arrays
 Given two sorted arrays, find their union and intersection.

 For example, if the input arrays are:
 arr1[] = {1, 3, 4, 5, 7}
 arr2[] = {2, 3, 5, 6}
 Then your program should print Union as {1, 2, 3, 4, 5, 6, 7} and Intersection as {3, 5}.
 */
public class UnionAndIntersectionOfArrays {

    // time complexity O(lengthA+lengthB)
    static void unionOfTwoSortedArrays(int[] a,int[] b){
        int i=0,j=0;

        while (i < a.length && j< b.length){
            if (a[i] < b[j]){
                System.out.print(a[i++] + ",");
            } else if ( b[j] < a[i]){
                System.out.print(b[j++] + ",");
            }
            // both a[i] & b[j] are same , print one and increment the other
            else {
                System.out.print(b[j++] + ",");
                i++;
            }

        }

        // print the elements in the largest array
        while (i < a.length){
            System.out.print(a[i++] + ",");
        }
        while (j < b.length){
            System.out.print(b[j++] + ",");
        }

    }

    static void printIntersection(int[] a,int[] b){
        int i = 0,j=0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]){
                i++;
            } else if ( b[j] < a[i]){
                j++;
            }
            // both a[i] & b[j] are same , print one and increment the other
            else {
                System.out.print(b[j++] + ",");
                i++;
            }
        }
    }

    /*
    Another approach that is useful when difference between sizes of two given arrays is significant.
The idea is to iterate through the shorter array and do a binary search
for every element of short array in big array (note that arrays are sorted).
Time complexity of this solution is O(min(mLogn, nLogm)).
This solution works better than the above approach when ratio of larger length to
smaller is more than logarithmic order.
     */
    static void printIntersectionByBinarySearch(int[] largeArray,int[] smallArray){

        // O(smallArray.length(log n )~ o(mlogn) --> where m = elements in small array
        for (int i = 0; i < smallArray.length; i++) {
             int found = Arrays.binarySearch(largeArray,smallArray[i]);
             if(found >= 0){
                 System.out.println(smallArray[i]);
             }
        }

    }
    public static void main(String...args){
        int[] a = {1,2,4,5,6};
        int[] b = {2,3,5,7};

         //unionOfTwoSortedArrays(a,b);
          //printIntersection(a,b);
        printIntersectionByBinarySearch(a,b);
    }
}
