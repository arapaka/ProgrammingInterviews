package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/19/16.
 */
public class SearchInRotatedArray {

     public int search(int[] a, int low, int high , int key){
               if(low > high) {
                   return -1;
               }
           int mid = (low+high)/2;
         if(a[mid] == key){
             return mid;
         }

         // if a[left..mid] is sorted
          if(a[low] < a[mid]){
               if(a[mid] > key) {
                   return search(a,low,mid-1,key);
               } else {
                   // search right
                   return search(a,mid+1,high,key);
               }

          }

         // if a[mid...right] appears to be sorted

         if(key >= a[mid] && key <= a[high]){
             return search(a,mid+1,high,key);
         } else {
             return search(a,low,mid-1,key);
         }
     }
    public static void main(String...args){

    }
}
