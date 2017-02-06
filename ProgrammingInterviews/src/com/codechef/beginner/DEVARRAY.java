package com.codechef.beginner;

import java.util.Scanner;

/**
 * Created by archithrapaka on 11/1/16.
 */
public class DEVARRAY {

     public static long[] getMaxMin(long[] a) {
          long[] minMax = new long[2];

           minMax[0] = a[0];
           minMax[1] = a[0];

         for (int i = 1; i < a.length; i++) {
                if(a[i] < minMax[0]) {
                    minMax[0] = a[i];
                }
              if (a[i] > minMax[1]){
                  minMax[1] = a[i];
              }
         }
         return minMax;
     }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        sc.nextLine();

        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
              a[i] = sc.nextLong();
        }
        sc.nextLine();

        long[] minMax = getMaxMin(a);
        long min = minMax[0];
        long max = minMax[1];

        while (Q > 0) {
              int x = sc.nextInt();
              if(x >= min && x <= max){
                  System.out.println("Yes");
              } else {
                  System.out.println("No");
              }
            Q--;
        }
    }
}
