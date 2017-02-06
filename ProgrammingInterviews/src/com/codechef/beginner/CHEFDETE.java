package com.codechef.beginner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by archithrapaka on 11/1/16.
 */
public class CHEFDETE {

    // this is causing second test for TLE
    public static void find() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        // build a map of relationships

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = 0; i < N; i++) {
            map.put(i+1,a[i]);
        }

        for (int i = 1; i <=N ; i++) {
            if(!map.containsValue(i)){
                System.out.print(i + " ");
            }
        }
    }
      // ACCEPTED
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
             a[i] = sc.nextInt();
        }

        boolean[] present = new boolean[N+1];

        for (int i = 0; i < a.length; i++) {
               if(!present[a[i]]) {
                   present[a[i]] = true;
               }
        }

        for (int i = 1; i <= N ; i++) {
                 if(!present[i]){
                     System.out.print(i + " ");
                 }
        }
    }
}
