package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 7/29/16.
 */
public class ReplaceEveryElementWithGreatestOnRight {

    public static void replaceGreatestOnRight(int[] a){
        int n = a.length;
        int max_from_right = a[n-1];

        // The next greatest element for the rightmost element
        // is always -1
        a[n-1] = -1;

        for (int i = n-2; i >= 0; i--) {
             int temp = a[i];
            a[i] = max_from_right;
            if (max_from_right < temp){
                max_from_right = temp;
            }
        }
        for (int i:a
             ) {
              System.out.print(i + ",");
        }
    }

    // similar like above method , just prints doesn not replace array elements..
    public static void printLeaderElements(int[] a){
        int n = a.length;
        int max_from_right = a[n-1];
        System.out.println(max_from_right);
        for (int i = n-2; i >= 0 ; i--) {
                if(a[i] > max_from_right){
                    max_from_right = a[i];
                    System.out.println(a[i]);
                }
        }
    }
    public static void main(String[] args){
        int a[] = {16, 17, 4, 3, 5, 2};
        printLeaderElements(a);
    }
}
