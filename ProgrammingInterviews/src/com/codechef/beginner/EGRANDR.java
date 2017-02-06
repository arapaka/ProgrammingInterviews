package com.codechef.beginner;

import java.util.Scanner;

/**
 * Created by archithrapaka on 11/2/16.
 */
public class EGRANDR {




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        sc.nextLine();

        while (T > 0) {
           int N = sc.nextInt();
            int[] a = new int[N];
            int sum = 0;
            int fullScore = 0;
            //double gpa = 0;
            boolean failed = false;

            for (int i = 0; i < N; i++) {
                  a[i] = sc.nextInt();
                       if(a[i] == 5){
                           fullScore++;
                       }
                     else if (a[i] <= 2){
                           failed = true;
                       }
                sum += a[i];
            }
            //gpa = sum/N;

            if (!failed && fullScore >=1 && sum < 4*N){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            T--;
        }
    }
}
