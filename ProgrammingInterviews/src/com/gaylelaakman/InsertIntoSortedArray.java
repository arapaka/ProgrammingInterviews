package com.gaylelaakman;

/**
 * Created by archithrapaka on 9/11/16.
 */
public class InsertIntoSortedArray {

    static int orderedInsert (int arr[], int first, int last, int target)
// insert target into arr such that arr[first..last] is sorted,
//   given that arr[first..last-1] is already sorted.
//   Return the position where inserted.
    {
        int i = last;
        while ((i > first) && (target < arr[i-1]))
        {
            arr[i] = arr[i-1];
            i = i - 1;
        }
        arr[i] = target;
        return i;
    }

    public static void main(String...args){
        int[] a = {1,2,4,5,7};
        System.out.println(orderedInsert(a,0,4,3));
        for (int i:a
             ) {
             System.out.print(i+" ,");
        }
    }
}
