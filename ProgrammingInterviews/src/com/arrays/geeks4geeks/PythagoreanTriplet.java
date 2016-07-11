package com.arrays.geeks4geeks;

import java.util.Arrays;

/**
 * Created by archithrapaka on 7/10/16.
 */
public class PythagoreanTriplet {

    public static void printTriplet(int[] a){

        Arrays.sort(a);
        /* Now fix the first element one by one and find the
       other two elements */
        int l ,r;
        int n = a.length;
        for (int i = n-1; i >= 2; i--) {
            l = 0;
            r = i-1;

            //int cal = ;
            while (l < r){
                if ( a[l]*a[l]+ a[r]*a[r]  == a[i]*a[i]){
                    System.out.println("the pythagorean triplet pair is :"+"("+a[l]+","+a[r]+","+a[i]+")");
                    l++;
                    r--;
                }
                else if (a[l]*a[l]+ a[r]*a[r] < a[i]*a[i]){
                    l++;
                }
                else {
                    r--;
                }
            }
        }

        //return false;
    }


    public static void main(String[] args){
        int[] b = {3,4,5,12,13,9,40,41};
        printTriplet(b);
    }
}
