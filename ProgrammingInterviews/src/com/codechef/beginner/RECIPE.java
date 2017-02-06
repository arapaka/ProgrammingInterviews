package com.codechef.beginner;

import java.util.Scanner;

/**
 * Created by archithrapaka on 10/31/16.
 */
public class RECIPE {

    public static int getMax(int[] a){
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
               max = Math.max(a[i],max);
        }
        return max;
    }

    public static void main(String[] args){
        int[] A = {3,20,9,6};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // testcases ..

        while (T > 0 ){
            int[] ing = new int[sc.nextInt()];

            int d = 1;
            for (int i = 0; i < ing.length; i++) {
                       ing[i] = sc.nextInt();
            }

            int max = getMax(ing);

            for (int i = 2; i <= max; i++) {
                boolean div = true;

                for (int j = 0; j < ing.length; j++) {
                     div = div & (ing[j] % i == 0);
                }
                if (div) d = i;
            }

            for (int i = 0; i < ing.length; i++) {
                System.out.print(ing[i]/d+" ");
            }
            System.out.println();
            T--;
        }
    }
}
