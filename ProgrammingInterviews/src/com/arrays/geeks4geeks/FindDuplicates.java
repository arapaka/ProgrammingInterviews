package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 6/26/16.
 * Given an array of n elements which contains elements from 0 to n-1, with any of these numbers appearing any number of times.
 * Find these repeating numbers in O(n) and using only constant memory space.
 */
public class FindDuplicates {
    // provided the element ar in the range of 0, to n

    static void printDups(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[Math.abs(a[i])] > 0){
                a[Math.abs(a[i])] = - a[Math.abs(a[i])];
            }
            else {
                System.out.println("this is a duplicate element :"+Math.abs(a[i]));
            }
        }

    }

    public static void main(String...args){
        int[] a = {1, 2, 3, 1, 3, 6, 6};
        printDups(a);
    }
}
