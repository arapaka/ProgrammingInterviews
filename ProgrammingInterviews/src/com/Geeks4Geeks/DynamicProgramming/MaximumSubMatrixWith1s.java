package com.Geeks4Geeks.DynamicProgramming;

/**
 * Created by archithrapaka on 10/27/16.
 */
public class MaximumSubMatrixWith1s {

    private static int min(int a , int b , int c){
        return Math.min(Math.min(a,b),c);
    }


    public static void maxSize(int[][] a){
          int max = 0;
         int max_result = a[0][0];
          int max_i = a[0][0];
          int max_j = a[0][0];
        int result[][] = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
             result[i][0] = a[i][0];
              if(result[i][0] == 1){
                  max = 1;
              }
        }

        for (int i = 0; i < a[0].length; i++) {
              result[0][i] = a[0][i];
              if(result[0][i] == 1){
                  max = 1;
              }
        }

        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                     if(a[i][j] == 0){
                         continue;
                     }
                result[i][j] = min(result[i][j-1],result[i-1][j-1],result[i-1][j])+1;

                if(max_result < result[i][j]){
                    max_result = result[i][j];
                    max_i = i;
                    max_j = j;
                }

            }
        }
       System.out.print("printing the sub matrix :");

        int count = 0;
        for (int i = max_i; i > max_i - max_result ; i--) {
            for (int j = max_j; j > max_j - max_result; j--) {
                     if(count % 3 == 0){
                         System.out.println();
                     }
                System.out.print(a[i][j] + " ");
                count++;
            }
        }

        System.out.println("printing the result matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                  if(count %5 == 0){
                      System.out.println();
                  }
                System.out.print(result[i][j] + " ");
                count++;
            }
        }
    }

    public static void main(String...args){
        int arr[][] = {{0,1,1,0,1},
                       {1,1,1,0,0},
                       {1,1,1,1,0},
                       {1,1,1,0,1}};
        maxSize(arr);
    }
}
