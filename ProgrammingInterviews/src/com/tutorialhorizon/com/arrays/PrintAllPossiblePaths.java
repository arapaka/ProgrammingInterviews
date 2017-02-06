package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/18/16.
 */
public class PrintAllPossiblePaths {

     static void printallPaths(int[][] a , int row , int column , int rowCount , int colCount , String path,int count){

         // final row has been reached , so only possible move is to right
         if(row == rowCount-1){
             for (int i = column; i <= colCount-1; i++) {
                  path = path + "-->" + a[row][i];
             }
             count +=1;
             System.out.println(path + " , count : " + count);
             return;
          }

         // final column has reached , so only way to move is down..
         if(column == colCount-1){
             for (int j = row; j <= rowCount-1; j++) {
                 path += "-->" + a[j][column];
             }
             count +=1;
             System.out.println(path + " , count : " + count);
             return;
         }
         // otherwise we just append the current row , col to path
         path = path + "-->" + a[row][column];
         // moving down
        printallPaths(a,row+1,column,rowCount,colCount , path,count);

         // moving right
         printallPaths(a,row,column+1,rowCount,colCount,path,count);

         // you could also move diagonally

         printallPaths(a,row+1,column+1,rowCount,colCount,path,count);

     }


    // by Recursion
    static int countAllPaths(int[][] a , int row , int column , int rowCount , int colCount ,int count){

        // final row has been reached , so only possible move is to right
        if(row == rowCount-1){
            return 1;
        }

        // final column has reached , so only way to move is down..
        if(column == colCount-1){
            return 1;
        }
        // otherwise we just append the current row , col to path
        // moving down
       return  countAllPaths(a,row+1,column,rowCount,colCount,count)
               +
        // moving right
         countAllPaths(a,row,column+1,rowCount,colCount,count)
               +
        // you could also move diagonally
               +
         countAllPaths(a,row+1,column+1,rowCount,colCount,count);

    }

    // count all paths by dynamic programming...
    public int printAllDynamic(int[][] arrA) {
        int[][] resultCount = new int[arrA.length][arrA[0].length];
        for (int i = 0; i < arrA.length; i++) {
            resultCount[i][0] = 1;
        }
        for (int i = 0; i < arrA[1].length; i++) {
            resultCount[0][i] = 1;
        }

        for (int i = 1; i < arrA.length; i++) {
            for (int j = 1; j < arrA[1].length; j++) {
                resultCount[i][j] = resultCount[i][j - 1]
                        + resultCount[i - 1][j] + resultCount[i - 1][j - 1];
            }
        }
        return resultCount[arrA.length - 1][arrA[0].length - 1];
    }


    public static void main(String...args){
        int[][] a = { { 1, 2, 3 },
                      { 4, 5, 6 } ,
                       {7, 8, 9} };
        StringBuilder sb = new StringBuilder("");
       // printallPaths(a,0,0,3,3,"",0);
        int count = countAllPaths(a,0,0,3,3,0);
        System.out.println(count);
    }
}
