package com.arrays.geeks4geeks;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by archithrapaka on 6/15/16.
 * Find the Number Occurring Odd Number of Times
 Given an array of positive integers. All numbers occur even number of times
 except one number which occurs odd number of times.
 Find the number in O(n) time & constant space.

 A Simple Solution is to run two nested loops.
 The outer loop picks all elements one by one and inner loop
 counts number of occurrences of the element picked by outer loop.
 Time complexity of this solution is O(n2).

 A Better Solution is to use Hashing.
 Use array elements as key and their counts as value.
 Create an empty hash table.
 One by one traverse the given array elements and store counts.
 Time complexity of this solution is O(n).
 But it requires extra space for hashing.

 The Best Solution is to do bitwise XOR of all the elements.
 XOR of all elements gives us odd occurring element.
 Please note that XOR of two elements is 0 if both elements are same
 and XOR of a number x with 0 is x.
 */

public class NumberOccurringOddNumberOfTimes {

    //Better solution using hashmap , but extra space O(n)
    static void getOddOccurrence(int[]a){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i:a
             ) {
                 if (!map.containsKey(i)){
                     map.put(i,1);
                 } else {
                     map.put(i,map.get(i)+1);
                 }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             if(entry.getValue() % 2 != 0){
                 System.out.println("Odd repeating number:"+entry.getKey());
             }
        }
    }


    //Best solution using xor --->

    static void getOddOccur(int[] a){
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res = res ^ a[i];
        }
        System.out.println("the odd number is :"+res);
    }

    public static void main(String...args){
        int a[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        getOddOccur(a);
        getOddOccurrence(a);
    }
}
