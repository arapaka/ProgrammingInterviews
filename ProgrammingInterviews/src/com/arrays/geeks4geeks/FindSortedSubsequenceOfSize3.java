package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 8/4/16.
 */
public class FindSortedSubsequenceOfSize3 {

    // o(n*n) .. sorted sub sequence of size k , lets try with k = 3;

    static void findSortedSequence(int[] a , int k){
        int count[] = new int[a.length];
        int i = 0;

        // initialize all counts by 1
        for (int j = 0; j < count.length; j++) {
            count[j] = 1;
        }

        // we have initialized the counts array with all elements  greater than a[i] from a[i+1]...a[n-1]
        for ( i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                  if (a[j] > a[i]){
                      count[i] = count[i]+1;
                  }
            }
        }

        // find the kth count and grab the index associated with the count ..

        int index = 0;
        for (int j = 0; j < count.length; j++) {
             if(count[j] == k){
                 index = j;
                 break;
             }
        }
        int target = a[index];

        System.out.print("the subsequence of size " + k + " is ");
        System.out.print(target + ",");

        for (int j = index+1; j < a.length; j++) {
              if(a[j] > target){
                  System.out.print(a[j] + ",");
              }
        }
    }

    public static void main(String...args){
        int[] a = {12, 11, 10, 5, 6, 2, 30};
        findSortedSequence(a,2);

    }
}
