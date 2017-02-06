package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/18/16.
 */
public class TwoDArraySearch {

    public static int findElement(int[][] a , int key){
        int row = 0;
        int col = a.length-1;
        StringBuilder sb = new StringBuilder("");

        while (row < a.length && col >= 0){
               if(a[row][col] == key){
                   sb.append("--> "+ a[row][col]);
                   return 1;
               }
             else if(a[row][col] > key){
                   sb.append("--> "+ a[row][col]);
                   col--;
               }
            else {
                   sb.append("--> "+ a[row][col]);
                   row++;
               }
        }
        System.out.print(sb.toString());
        return -1;
    }

    public static void main(String...args){
        int mat[][] = { {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50},};

       findElement(mat,50);
    }
}
