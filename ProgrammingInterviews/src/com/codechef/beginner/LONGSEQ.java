package com.codechef.beginner;

import java.util.Scanner;

/**
 * Created by archithrapaka on 11/2/16.
 */
public class LONGSEQ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T > 0) {
            int[] count = new int[2];
            String num = sc.nextLine();

            for (int i = 0; i < num.length(); i++) {
                   if(num.charAt(i) == '0'){
                       count[0]++;
                   } else {
                       count[1]++;
                   }
            }
            if(count[0] == 1 || count[1] == 1){
                System.out.println("Yes");
            }  else {
                System.out.println("No");
            }
            T--;
        }
    }
}
