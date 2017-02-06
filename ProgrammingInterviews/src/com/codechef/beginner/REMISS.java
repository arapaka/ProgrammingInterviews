package com.codechef.beginner;

import java.util.Scanner;

/**
 * Created by archithrapaka on 11/1/16.
 */
public class REMISS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            System.out.print(Math.max(A,B) + " " + (A+B));
            System.out.println();
            T--;
        }
    }
}
