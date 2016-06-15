package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 6/14/16.
 * link :http://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/
 *
 * Given an array and a value, find if there is a triplet in array whose sum is equal to the given value.
 * If there is such a triplet present in array, then print the triplet and return true.
 * Else return false. For example, if the given array is {12, 3, 4, 1, 6, 9} and given sum is 24,
 * then there is a triplet (12, 3 and 9) present in array whose sum is 24.
 */
public class SumTriplet {

    // method 1 -->brute force --> O(n^3) complexity for three For loops

    public static void printTripletBruteForce(int[] a,int sum){
        for (int i = 0; i < a.length-2; i++) {
            for (int j = i+1; j < a.length-1; j++) {
                for (int k = j+1; k < a.length; k++) {
                    if(a[i]+a[j]+a[k] == sum){
                        System.out.println("the triplet pair is :"+"("+a[i]+","+a[j]+","+a[k]+")");
                    }
                }
            }
        }
    }

    // method 2 , first sort , from fix one element and apply binary search

    public static boolean printTripletByHashMap(int[] a,int sum){

        /* Now fix the first element one by one and find the
       other two elements */
        int l ,r;
        for (int i = 0; i < a.length-2; i++) {
            l = i+1;
            r = a.length-1;

            while (l < r){
                if (a[i] + a[l]+a[r] == sum){
                    System.out.println("the triplet pair is :"+"("+a[i]+","+a[l]+","+a[r]+")");
                    return true;
                }
                else if (a[i] + a[l]+a[r] < sum){
                    l++;
                }
                else {
                    r--;
                }
            }
        }

        return false;
    }


    public static void main(String...args){

    }
}
