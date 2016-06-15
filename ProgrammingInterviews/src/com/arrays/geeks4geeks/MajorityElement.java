package com.arrays.geeks4geeks;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by archithrapaka on 6/14/16.
 * Majority Element
 Majority Element: A majority element in an array A[] of size n is an element
 that appears more than n/2 times (and hence there is at most one such element).

 Write a function which takes an array and emits the majority element
 (if it exists), otherwise prints NONE as follows:
 */
public class MajorityElement {

    //brute force using extra space hash map
    public static void printMajority(int[] a){
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
            if (entry.getValue() > (int)a.length/2) {
                System.out.println(entry.getKey());
            }
        }
    }

    /* Function to find the candidate for Majority */
    public static int findCandidateByMooresAlgorithm(int[] a){
        int maj_index = 0;
        int count = 1;

        for (int i = 1; i < a.length; i++) {
             if(a[maj_index] == a[i]){
                 count++;
             }
            else
                 count--;
            if (count == 0){
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }

    public static void printMajority(int[] a, int candidateElement){
        int i, count = 0;
        for (i = 0; i < a.length; i++)
            if(a[i] == candidateElement)
                count++;
        if (count > a.length/2)
            System.out.print("Majority Element is " + candidateElement);
        else
            System.out.println("NONE");
    }

    public static void main(String...args){

    }
}
