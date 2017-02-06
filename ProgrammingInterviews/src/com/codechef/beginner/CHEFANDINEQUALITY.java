package com.codechef.beginner;

import java.util.Scanner;

/**
 * Created by archithrapaka on 11/1/16.
 */
public class CHEFANDINEQUALITY {

    public static void countpairs(long x , long maxX, long y,long maxY){
        long count = 0;
        for (long i = x; i <= maxX; i++) {
            long l = Math.max(y,i+1);
            long r = maxY;

            if( l <=r) {
                count += r-l+1;
            }
        }
       System.out.println(count);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        sc.nextLine();

        while (T > 0) {
             countpairs(sc.nextLong(),sc.nextLong(),sc.nextLong(),sc.nextLong());
            T--;
        }
    }
}
