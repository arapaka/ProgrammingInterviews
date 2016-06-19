package com.arrays.geeks4geeks;

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

    public static void main(String...args){
        int[] a = {1,2,4,5,6};
        int[] b = {2,3,5,7};

         //unionOfTwoSortedArrays(a,b);
          printIntersection(a,b);
    }
}
