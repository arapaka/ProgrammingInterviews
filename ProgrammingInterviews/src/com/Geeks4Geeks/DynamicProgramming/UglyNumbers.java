package com.Geeks4Geeks.DynamicProgramming;

/**
 * Created by archithrapaka on 10/27/16.
 */
public class UglyNumbers {

    // if you dont want to store the numbers then there is no need of space 0(n)
    public static int printUgly(int num){
         int[] ugly = new int[num];
        ugly[0] = 1;
        int m2 = 0;
        int m3 = 0;
        int m5 = 0; // multiples of two , three , five;

        int next_ugly_num = 0;
        int next_multiple_two = 2;
        int next_multiple_three = 3;
        int next_multiple_five = 5;
        for (int i = 1; i < num; i++) {
            next_ugly_num = Math.min(Math.min(next_multiple_two,next_multiple_three),next_multiple_five);
                  ugly[i] = next_ugly_num;

            if(next_ugly_num == next_multiple_two){
                 m2 = m2+1;
                next_multiple_two = ugly[m2]*2;
             } if (next_ugly_num == next_multiple_three){
                 m3 = m3+1;
                next_multiple_three = ugly[m3]*3;
             }
            if(next_ugly_num == next_multiple_five){
                 m5 = m5+1;
                next_multiple_five = ugly[m5]*5;
             }
        }
      return ugly[num-1];
    }

    public static void main(String...args){
        int a = printUgly(150);
        System.out.print(a);
    }
}
