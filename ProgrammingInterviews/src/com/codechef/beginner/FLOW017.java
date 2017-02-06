package com.codechef.beginner;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by archithrapaka on 11/3/16.
 */
public class FLOW017 {

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
            int [] a = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }

//            int max = Math.max(a[0] , a[1]);
//            int min = Math.min(a[0],a[1]);
//
//              if(a[2] > max) {
//                 System.out.println(max);
//              }
//              else if ( a[2] < min){
//                  System.out.println(min);
//              }
           Arrays.sort(a);
            System.out.println(a[1]);

            T--;
        }
    }
}
