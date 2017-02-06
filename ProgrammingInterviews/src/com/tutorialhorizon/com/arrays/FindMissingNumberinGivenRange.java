package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/18/16.
 */
public class FindMissingNumberinGivenRange {
    //method 1 , sum of N numbers = n(n+1)/2 , sum of array elements = S , N-S gives the missing number

    public static long findMissingNumber(int[]a , int range){
          long sumOfN = (range)*(range+1)/2;

        long sum = 0;
        for (int i = 0; i < a.length; i++) {
              sum += a[i];
        }
        return (sumOfN - sum);
    }


    public static int[] findTwoMissingNumbers(int[] a , int range){
        long s = findMissingNumber(a,range); // get sum of two missing numbers..

        long product = 1;
        for (int i = 0; i < a.length; i++) {
            product *= a[i];
        }

        long productN = 1;
        for (int i = 1; i <=range; i++) {
            productN  *= i;
        }

        long productAB = productN/product;
        double diffSqr = Math.sqrt(s*s - 4*productAB);

        int A = (int) ((s+diffSqr)/2);
        int B = (int)s-A;
        int[] result = {A,B};
        return result;
    }
    public static void main(String...args){
        int[]a = {1,2,3,4,5,6,8,9,10};
        System.out.print(findMissingNumber(a,10));
    }
}
