package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 6/26/16.
 */
public class EquilibriumArray {

    static void printEquilibriumIndex(int[] a){
        int leftSum = 0;
        int rightSum = getSum(a);

        for (int i = 0; i < a.length; i++) {
               rightSum -= rightSum;
              if (leftSum == rightSum){
                  System.out.print("the Equilibrium index is :"+i);
              }
              leftSum += a[i];
        }

       //return -1;
    }

    static int getSum(int[] a){
        int sum = 0;
        for (int i:a
             ) {
              sum += i;
        }
        return sum;
    }

    public static void main(String...args){
        int[] a = {-7, 1, 5, 2, -4, 3, 0};
        printEquilibriumIndex(a);
    }
}
