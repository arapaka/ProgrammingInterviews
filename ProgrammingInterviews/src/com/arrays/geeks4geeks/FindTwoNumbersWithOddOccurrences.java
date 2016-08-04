package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 7/31/16.
 * A naive method to solve this problem is to run two nested loops.
 * The outer loop picks an element and the inner loop counts the number of occurrences of the picked
 * element. If the count of occurrences is odd then print the number.
 * The time complexity of this method is O(n^2).

 We can use sorting to get the odd occurring numbers in O(nLogn) time.
 First sort the numbers using an O(nLogn) sorting algorithm like Merge Sort, Heap Sort.. etc.
 Once the array is sorted, all we need to do is a linear scan of the array and print the odd
 occurring number.

 We can also use hashing. Create an empty hash table which will have elements and their counts.
 Pick all elements of input array one by one. Look for the picked element in hash table.
 If the element is found in hash table, increment its count in table.
 If the element is not found, then enter it in hash table with count as 1.
 After all elements are entered in hash table, scan the hash table and print elements with odd count.
 This approach may take O(n) time on average, but it requires O(n) extra space.
 */

public class FindTwoNumbersWithOddOccurrences {

    public static void findOddRepeating(int[] a){
        int xor2 = a[0];
        int set_bit = 0;
        int i , x= 0,y = 0;

        // get xor of all elements, xor will be basically xor of two odd occurring elements
        for ( i = 1; i < a.length; i++) {
            xor2 = xor2 ^ a[i];
        }

        // get setbit
        set_bit = xor2 & ~(xor2 -1);

        for ( i = 0; i < a.length; i++) {
              if((a[i] & set_bit) != 0) {
                   x = x ^ a[i];
              } else {
                  y = y ^ a[i];
              }
        }

        System.out.println("the numbers are:"+ x + ","+ y);

    }


    public static void main(String[] args){
        int arr[] = {4, 2, 4, 5, 2, 3, 3, 1};
        findOddRepeating(arr);
    }

}
