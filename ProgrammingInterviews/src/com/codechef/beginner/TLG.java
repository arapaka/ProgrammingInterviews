package com.codechef.beginner;

import java.util.Scanner;

/**
 * Created by archithrapaka on 11/2/16.
 */
public class TLG {


    static class Winner implements Comparable<Winner>{
        int id;
        int score;

        public Winner(int id, int score){
            this.id = id;
            this.score = score;
        }

        @Override
        public int compareTo(Winner winner) {
            return Integer.compare(this.score,winner.score);
        }
    }




    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();

        //PriorityQueue<Winner> winners = new PriorityQueue<Winner>(Collections.reverseOrder());
        int maxDiff = 0;
        int id = 0;
        while (N > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();

               if(A > B) {
                      if(A-B > maxDiff) {
                          id = 1;
                          maxDiff = A-B;
                      }

               } else if(A < B){
                     if(B-A > maxDiff) {
                         id = 2;
                         maxDiff = B-A;
                     }
               }
            N--;
        }
        //Winner winner = winners.poll();
        //System.out.print(winner.id + " " + winner.score);
        System.out.println(id + " " + maxDiff);
    }
}
