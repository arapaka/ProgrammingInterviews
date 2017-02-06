package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/18/16.
 */
public class QuickSort {

    public static void quickSort(int[] a , int low , int high){
        int left = low;
        int right = high;
        int mid = low + (high-low)/2;
        int pivot = a[mid];

        while (left <= right){
                while (a[left] < pivot){
                    left++;
                }
               while (a[right] > pivot){
                   right--;
               }
            if(left <= right ){
                    int temp = a[left];
                    a[left] = a[right];
                    a[right] = temp;
                    left++;
                    right--;
            }
        }
        // Recursion on left and right of the pivot
        if (low < right)
            quickSort(a,low, right);
        if (left < high)
            quickSort(a,left, high);
    }

    public static void main(String...args){
           int[] a= {6,2,4,12,10};
        quickSort(a,0,4);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
