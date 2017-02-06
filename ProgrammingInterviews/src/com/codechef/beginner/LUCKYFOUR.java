package com.codechef.beginner;

import java.util.Scanner;

/**
 * Created by archithrapaka on 11/3/16.
 */
public class LUCKYFOUR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T > 0) {
               int count = 0;
                String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                      if(s.charAt(i) == '4') {
                          count++;
                      }
            }
            System.out.println(count);
            T--;
        }
    }
}
