package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/18/16.
 */
public class RearrangePositveAndNegative {


    public static void partitionArray(int[] a ){
        int left = 0;
        int right = a.length-1;
        int pivot = 0;

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

        left = 1;
        int high = 0;
        while (a[high] < 0)
            high++;
        right = high;
        while (a[left] < 0 && right < a.length) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left = left + 2;
            right++;
        }

    }

    //Rearrange the array elements so that positive and negative numbers are placed alternatively.
    public static void partition2(int[] arr){
        int i = -1, temp = 0;
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] < 0)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Now all positive numbers are at end and negative numbers at
        // the beginning of array. Initialize indexes for starting point
        // of positive and negative numbers to be swapped
        int pos = i+1, neg = 0;

        // Increment the negative index by 2 and positive index by 1, i.e.,
        // swap every alternate negative number with next positive number
        while (pos < arr.length && neg < pos && arr[neg] < 0)
        {
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg++;
        }
    }

    public static void main(String...args){
        int[] a = {1, 2, -3, -4, -5, 6, -7, -8, 9, 10, -11, -12, -13, 14};
        partitionArray(a);

        //partition2(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
