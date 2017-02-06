package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/24/16.
 */
public class CommonNumbers3sortedArrays {

    public static void findCommon(int[] a, int[] b , int[] c){
          int i = 0, j= 0 , k = 0;

        while (i < a.length && j < b.length && k < c.length){
                if(a[i] == b[j] &&  b[j] == c[k]){
                    System.out.print("(" + a[i]+","+b[j]+"," + c[k]+")");
                    i++;
                    j++;
                    k++;
                }
                else if (smaller(a[i],b[j],c[k])){
                    i++;
                }
            else if (smaller(b[j],a[i],c[k])){
                    j++;
                }
            else if (smaller(c[k],b[j],a[i])){
                    k++;
                }

        }
    }

    public static boolean smaller(int i , int j , int k){
         return (i <= j) && (i <= k);
    }


    public static void main(String...args){
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int[] B = {1,3,5,6,7,8,12};
        int[] C = {2,3,4,5,8,9};

        findCommon(A,B,C);
    }
}
