package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 6/16/16.
 * Leaders in an array
 Write a program to print all the LEADERS in the array.
 An element is leader if it is greater than all the elements to its right side.
 And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2},
 leaders are 17, 5 and 2.
 */
public class LeadersInArray {

    //naive O(n^2) , use two loops
    static void printLeaders(int[]a){
        for (int i = 0; i < a.length; i++) {
            int j;
            for ( j = i+1; j < a.length; j++) {
                        if (a[i] <= a[j]){
                            break;
                        }
            }
            // all elements after i ARE LESSER THAN i , so print them as the inner loop is not broken
            if (j == a.length){
                System.out.println(a[i]);
            }
        }
    }

    // better implementation.Method 2 (Scan from right)
    //Scan all the elements from right to left in array and
    // keep track of maximum till now. When maximum changes it’s value, print it.

    static void printLeadersFromRight(int[] a){
       // last element is always a leader
        int max_from_right = a[a.length-1];

        System.out.println(max_from_right);

        for (int i = a.length-2; i >=0 ; i--) {
              if(max_from_right < a[i]){
                  max_from_right = a[i];
                  System.out.println(a[i]);
              }
        }
    }


    public static void main(String...urghh){
        int arr[] = {16, 17, 4, 3, 5, 2};
        printLeadersFromRight(arr);
   }
}
