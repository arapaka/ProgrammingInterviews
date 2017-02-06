package com.tutorialhorizon;

/**
 * Created by archithrapaka on 10/17/16.
 */
public class NumberOfOccurrencesInSortedArray {

    public static int searchFirstOccurence(int[] a,int target, int start , int end) {

        //int first = Arrays.binarySearch(a,target);
        int first = -1;
        //int mid = start + (end - start) / 2;
        int result = 0;

        while (start <= end){
             int mid = start + (end-start)/2;

             if(a[mid] > target){
                 end = mid-1;
             }
             // may have elements on the left
            else if(a[mid] == target){
                 result = mid;
                 end = mid-1;
             }
            else {
                 start = start+1;
             }
        }
        return result;
    }

    public static int searchLastOccurence(int[] a , int target , int start , int end){
             int mid = 0;
             int result = 0;
        while (start <= end) {
             mid = start + (end-start)/2;

            if(a[mid] > target){
                end = mid-1;
            }
            else if(mid == end || (a[mid] == target && a[mid+1] > target)){
                result = mid;
                break;
            } else {
                start = mid+1;
            }
        }
        return result;
    }
    public static void  main(String...args){
        int[] a = {1,2,2,2,2,2,2,2,3,4,5,5,6};
        //System.out.print(Arrays.binarySearch(a,4));
        int first = searchFirstOccurence(a,2,0,a.length-1);
        int last = searchLastOccurence(a,2,0,a.length-1);
        System.out.println(first);
        System.out.println(last);
    }
}
