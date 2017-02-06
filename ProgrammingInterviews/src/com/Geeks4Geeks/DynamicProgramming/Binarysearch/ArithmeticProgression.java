package com.Geeks4Geeks.DynamicProgramming.Binarysearch;

/**
 * Created by archithrapaka on 10/28/16.
 */
public class ArithmeticProgression {

    public static int findMissing(int[] a){
            int low = 0;
            int high = a.length-1;
            int mid = 0;
        int diff = (a[high] - a[low])/a.length;
        while (low <= high){
             mid = (low+high)/2;

             if(a[mid] > (a[0]+ mid*diff ) && a[mid-1] == a[0] + (mid-1)*diff){
                 return (a[0]+ mid*diff);
             }
            else if (a[mid] == (a[0]+ mid*diff)) {
                 low = mid+1;
            } else {
                 high = mid-1;
             }
        }
        return -1;
    }

    public static void main(String args[]){
        int input[] = {1,7,10,13,16,19,22};
        System.out.println(findMissing(input));
    }
}
