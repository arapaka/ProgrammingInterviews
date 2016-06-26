package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 6/25/16.
 */
public class ProductArrayPuzzle {

    static void productArray(int[] a,int n){
          int[] left = new int[n];
          int[] right = new int[n];

          left[0] = right[n-1] = 1;

        // build left array

        int i;

        for (i = 1; i < n; i++) {
            left[i] = a[i-1] * left[i-1];
        }

        // build right array (start from  right ..)

        for (i = n-2; i >=0 ; i--) {
            right[i] = right[i+1] * a[i+1];
        }

        // multiply left and right arrays

        for (int j = 0; j < n; j++) {
            a[j] = left[j] * right[j];
        }

        for (int a1:a
             ) {
             System.out.print(a1 + " ");
        }

    }

    static  void productArray(int[] a){
        int n = a.length;
        int[] prod = new int[n];

        int temp = 1,i ;
       /* In this loop, temp variable contains product of
    elements on left side excluding arr[i] */
        for (i = 0; i < n; i++) {
            prod[i] = temp;
            temp = temp* a[i];
        }

        /* Initialize temp to 1 for product on right side */
        temp = 1;
        /* In this loop, temp variable contains product of
    elements on right side excluding arr[i] */
        for(i= n-1; i>=0; i--)
        {
            prod[i] = prod[i]*temp;
            temp = temp * a[i];
        }
        for (int a1:prod
             ) {
            System.out.print(a1 + ",");
        }
    }

    public static void main(String...args){
        int[] a = {10, 3, 5, 6, 2};
        //productArray(a,5);
        productArray(a);
    }
}
