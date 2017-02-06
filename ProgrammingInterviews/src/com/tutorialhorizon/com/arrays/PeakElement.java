package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/18/16.
 */
public class PeakElement {

    static int findPeakElement(int[] a){
        int start = 0;
        int high = a.length-1;

        while (start <= high){
            int mid = start + (high-start)/2;
             if(a[mid] < a[mid+1]) {
                 start = mid+1;
             }
            else if (a[mid] < a[mid-1]){
                 high = mid-1;
             }
            return mid;
        }
        return -1;
    }
    public static void main(String...args){
        int[]a  = {1,2,3,4,0,1,5,4,3,2,1};
        System.out.println(findPeakElement(a));
    }
}
