package com.codechef.beginner;

import java.util.Scanner;

/**
 * Created by archithrapaka on 11/7/16.
 */
public class ALEXTASK {

    public static int findLcm(int x , int y) {
         int max = Math.max(x,y);
         int min = Math.min(x,y);

        int lcm = 0;
        for(int i=1;i<=min;i++)
        {
            x=max*i;
            if(x%min==0)

            {
                lcm=x;
                break;
            }}

        return lcm;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T > 0) {
             int N = sc.nextInt();
             sc.nextLine();
            int [] a = new int[N];

            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
            sc.nextLine();
            //Arrays.sort(a);
            int min = findMin(a);
            int curr_lcm = 0;
            int min_lcm = Integer.MAX_VALUE;

            for (int i = 1; i < N; i++) {
                    curr_lcm = findLcm(min,a[i]);
                      min_lcm = Math.min(curr_lcm,min_lcm);
            }
            System.out.println(min_lcm);
            T--;
        }
    }
    static int findMin(int[] a){
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
                 if(a[i] < min){
                     min = a[i];
                 }
        }
        return min;
    }
}
