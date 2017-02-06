package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/18/16.
 */
public class BinarySearch {

    public static int binarySearch(int[] array , int key){
         int start = 0;
         int end = array.length-1;


        while (start <= end){
            int mid = start + (end-start)/2;
              if(array[mid] == key){
                  System.out.println("Found at index :" + mid);
                  return mid;
              }
            else if(array[mid] > key){
                  end = mid-1;
              }
              // a[mid] < key
            else {
                  start = mid+1;
              }
        }
        // if you come here , then it is  not found ...
        return -1;
    }


    public static void main(String...args){
        int[] a = {1,2,3,4,5};
        binarySearch(a,4);
    }
}
