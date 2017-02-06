package com.codechef.beginner;

import java.util.Scanner;

/**
 * Created by archithrapaka on 11/1/16.
 */
public class STUDVOTE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] A = new int[N+2];
            A[0] = -1;
            A[N+1] = -1;
            int[] count = new int[N+1];
            count[0] = -1;

            for (int i = 1; i <= N; i++) {
                A[i] = sc.nextInt();
            }

            for (int i = 1; i <=N; i++) {
                 count[A[i]]++;
            }

            int counts = 0;
            for (int i = 1; i <= N ; i++) {
                  if(count[i] >= K  && A[i] != i){
                       counts++;
                  }
            }
            System.out.println(counts);
            T--;
        }
    }
}
