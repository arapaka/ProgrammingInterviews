package com.codechef.beginner;

import java.util.Scanner;

/**
 * Created by archithrapaka on 10/31/16.
 */
public class CHEFKEY {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T > 0) {
            int ans = 0;
              int H = sc.nextInt();
              int W = sc.nextInt();
              int K = sc.nextInt();

            for (int h = 1; h <= H; h++) {
                if (K % h == 0) {
                    int w = K / h;
                    if (w <= W) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
            T--;
        }


    }
}
