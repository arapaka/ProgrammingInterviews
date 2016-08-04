package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 8/3/16.
 */
public class FindMaximumJMinusI {

    //naive o(n*2)

    public static void findMaxDiff(int[] a){
        int i,j;

        int max = 0;

        for ( i = 0; i < a.length-1; i++) {
                for (j=i+1; j < a.length ; j++){
                       if(a[j] > a[i] && (j-i > max)){
                           max = j-i;
                       }
                }
        }
        System.out.print("the max j-i for the array such that a[j] > a[i] is:" + max);
    }

    public static void findMax(int[] a){
        int maxDiff = 0,i=0,j=0;
        
        int[] leftMin = new int[a.length];
        int[] rightMax = new int[a.length];
        
        // construct leftMin SUCH THAT leftMin[i] stores minimum value from arr[0],arr[1]..a[1]
        
        leftMin[0] = a[0];

        for ( i = 1; i < a.length; i++) {
            leftMin[i] = Math.min(a[i],leftMin[i-1]);
        }

//        for (j=0;j<leftMin.length;j++) {
//            System.out.print(leftMin[j] +",");
//        }

        //construct right array such that rightMax[i] stores max value from a[j],a[j+1]..a[n-1]

        rightMax[a.length-1] = a[a.length-1];

        for (j = a.length-2; j >=0; --j){
            rightMax[j] = Math.max(a[j],rightMax[j+1]);
        }

        // traverse both arrays from left to right to find optimum j-i
         i=0;
        j=0;
        maxDiff = -1;

        while (i < a.length && j < a.length){
               if (leftMin[i] < rightMax[j]){
                   maxDiff = Math.max(maxDiff,j-i);
                   j = j+1;
               } else {
                   i = i+1;
               }
        }

        System.out.print("the max difference is :" + maxDiff);
    }

    public static void main(String...args){
        int[] a = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        //findMaxDiff(a);
        findMax(a);
    }
}
