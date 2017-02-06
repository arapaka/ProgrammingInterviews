package com.codechef.beginner;
import java.util.Scanner;
/**
 * Created by archithrapaka on 10/30/16.
 */
public class CIELRCPT {


    public static void minMenus(int[] menus , int sum){
        int min[] = new int[sum+1];

        // base case if given menu value is zero
        min[0] = 0;

        // initialize all table value as Infinite

        for (int i = 1; i <=sum; i++) {
            min[i] = Integer.MAX_VALUE;
        }

        // compute minimum menus required for all sums

        for (int i = 1; i <= sum ; i++) {
            // go through all menu prices smaller than sum

            for (int j = 0; j < menus.length; j++) {
                if(menus[j] <= i){
                    int sub_res = min[i-menus[j]];
                    min[i] = Math.min(sub_res+1,min[i]);
                }
            }

        }
        System.out.println(min[sum]);
    }

    public CIELRCPT() {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase > 0) {

                  int p = sc.nextInt();
                   int counter = 0;
                  while (p >= 2048){
                      p = p-2048;
                      counter++;
                  }

              while (p > 0){
                    if(p % 2 == 0){
                        counter++;
                    } else {
                        p = p/2;
                    }
              }
            System.out.println(counter);
            testCase--;
        }
    }

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int T = sc.nextInt(); //number of test cases
//
//        int menus[] = new int[12];
//
//        for (int i = 0; i < menus.length; i++) {
//            menus[i] = (int)Math.pow(2,i);
//        }
//
//        while (T > 0){
//            minMenus(menus,sc.nextInt());
//        }
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase > 0) {

            int p = sc.nextInt();
            int counter = 0;
            while (p >= 2048){
                p = p-2048;
                counter++;
            }

            while (p > 0){
                if(p % 2 == 1) {
                    counter++;
                }
                p = p/2;
            }
            System.out.println(counter);
            testCase = testCase-1;
        }
    }
}
