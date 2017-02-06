package com.Geeks4Geeks.DynamicProgramming.Binarysearch;

/**
 * Created by archithrapaka on 10/27/16.
 */
public class BinarySearch {
    public static int binarySearch(int[] A , int key , int l , int r){
        int countLoop = 0;
        int m = 0;
        while( r - l > 1 )
        {
            countLoop++;
            m = l + (r-l)/2;

            if( A[m] <= key )
                l = m;
            else
                r = m;
        }
        System.out.println("the number of times loop executes is :" +countLoop);
        if( A[l] == key )
            return l;
        else
            return -1;

    }


    public static int binarySearchOld(int[] a, int key , int left , int right){
        int mid = 0;
        int countLoop = 0;
        while (left <= right){
            countLoop++;
            mid = left + (right-left)/2;
               if(a[mid] == key){
                   System.out.println("the loop runs :"+countLoop);
                   return mid;
               }
             if (a[mid] < key){
                 left = mid+1;
             }
            else {
                 right = mid-1;
             }
        }
        System.out.println("the loop runs :"+countLoop);
        return -1;
    }

    public static void main(String...args){

        int[] a = new int[1000];
        for (int i = 0; i < 1000; i++) {
            a[i] = i;
        }


        int[] a1 = {0,1,2,3,5,5,6,7,8,9};
        binarySearch(a,999,0,1000);
        binarySearchOld(a,999,0,1000);
    }
}
