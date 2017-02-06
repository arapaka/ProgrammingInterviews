package com.Geeks4Geeks.DynamicProgramming.Binarysearch;

/**
 * Created by archithrapaka on 10/28/16.
 */
public class SquareRoot {
        public static int mySqrt(int x) {
            if (x == 0)
                return 0;
            int left = 1, right = x;
            int count = 0;
            while (true) {
                count++;
                int mid = left + (right - left)/2;
                if (mid > x/mid) {
                    right = mid - 1;
                } else {
                    if (mid + 1 > x/(mid + 1))
                        return mid;
                    left = mid + 1;
                }
            }
        }


    public static void main(String...args){
        System.out.println(mySqrt(64));
    }
}
