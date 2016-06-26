package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 6/26/16.
 * You are given an array of n+2 elements.
 * All elements of the array are in range 1 to n.
 * And all elements occur once except two numbers which occur twice.
 * Find the two repeating numbers.
 */
public class FindTwoRepeatingElements {

   // time complexity o(n) , but requires additional space o(n)
    static void printRepeatingNumbers(int[] a){
        int n = a.length;
        boolean[] map = new boolean[n];

        for (int i:a
             ) {
               if (map[i]){
                   System.out.print("This is a repeating number :" + i);
               }  else {
                   map[i] = true;
               }
        }
    }

    static void printRepeating(int[] a){
        for (int i = 0; i< a.length;i++) {
                if (a[Math.abs(a[i])] > 0){
                    a[Math.abs(a[i])] = - a[Math.abs(a[i])];
                }
             else {
                    System.out.println("repeated element:"+ Math.abs(a[i]));
                }
        }
    }
    public static void main(String...args){
        int[] a = {4, 2, 4, 5, 2, 3, 1};
        //printRepeatingNumbers(a);
        printRepeating(a);
    }
}
