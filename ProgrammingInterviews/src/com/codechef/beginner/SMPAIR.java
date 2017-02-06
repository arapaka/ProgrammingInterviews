package com.codechef.beginner;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by archithrapaka on 11/3/16.
 */
public class SMPAIR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
             int N = sc.nextInt();
            long[] a = new long[N];

            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[0]+a[1]);
            T--;
        }
    }
}
