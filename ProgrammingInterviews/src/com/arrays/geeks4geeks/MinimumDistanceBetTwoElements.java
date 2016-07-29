package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 7/10/16.
 */
public class MinimumDistanceBetTwoElements {
    // naive solution 0(n^2)
    public static void minDist(int[] arr,int x,int y){
        int i,j;

        int mindist = Integer.MAX_VALUE;

        for (i = 0; i < arr.length-1; i++) {
            for (j=i+1;j< arr.length;j++){
                 if((x == arr[i] && y == arr[j] ||
                         y == arr[i] && x == arr[j]) && mindist > Math.abs(i-j)){
                     mindist = Math.abs(i-j);
                 }
            }
        }
        System.out.println("the min dist is :" + mindist);
    }

    // fails for numbers when x == y , returns zero ..
    public static int printMinDist(int[] a,int x,int y){
          //int mindist = Integer.MAX_VALUE;

        int[] d = new int[2];

        d[0] = getFirstIndexOfElement(a,x);

        if(d[0] < 0){
            return -1;
        } else {
            d[1] = getFirstIndexOfElement(a,y);
        }

      //int min_dist = Math.abs(d[1]-d[0]);


        for (int i = 0; i < a.length; i++) {
              if(a[i] == x && Math.abs(d[1]-i) < Math.abs(d[1]-d[0])){
                  d[0] = i;
              }
            if(a[i] == y && Math.abs(i-d[0]) < Math.abs(d[1]-d[0])){
                d[1] = i;
            }
        }
        return Math.abs(d[1]-d[0]);
    }

    public static int getFirstIndexOfElement(int[] a,int x){
        for (int i = 0; i < a.length; i++) {
             if (a[i] == x){
                 return i;
             }
        }
        return -1;
    }

    public static int getMinDist(int[] a, int x,int y){
        int min_dist = Integer.MAX_VALUE;
        int i = 0,prev=0,n=a.length;


        for ( i = 0; i < n; i++) {
             if (a[i] == x || a[i] == y) {
                 prev = i;
                 break;
             }
        }

        // If the current element matches with any of the two then
        // check if current element and prev element are different
        // Also check if this value is smaller than minimm distance so far
        for (; i < n; i++) {
               if (a[i] == x || a[i] == y){
                     if (a[prev] != a[i] && (i-prev) < min_dist ){
                         min_dist = i-prev;
                         prev = i;
                     }
                    else {
                         prev = i;
                     }
               }
        }
        return min_dist;
    }

    public static void main(String[] args){
        int arr[] ={3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        System.out.println("the min dist is :"+getMinDist(arr,3,6));
    }
}
