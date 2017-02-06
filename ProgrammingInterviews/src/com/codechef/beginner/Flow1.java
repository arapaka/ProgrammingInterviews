package com.codechef.beginner;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by archithrapaka on 10/31/16.
 */
public class Flow1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            String[] ints = sc.nextLine().split("\\s");
            BigInteger bi = new BigInteger(ints[0]);
            BigInteger bi2 = new BigInteger(ints[1]);
            BigInteger bi3 = bi.add(bi2);
            System.out.println(bi3);
            T--;
        }
    }
}
