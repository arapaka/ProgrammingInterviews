package com.Geeks4Geeks.DynamicProgramming;

/**
 * Created by archithrapaka on 10/26/16.
 */
public class LargestSumContiguousSubarray {
     //kadane's algorithm..cannot handle negative numbers
     public static int getLargestSum(int[] a ) {
         int curr_sum = 0;
         int max_so_far = 0;
         for(int i : a ) {
             curr_sum += i;
             if(curr_sum < 0 ) {
                 curr_sum = 0;
             }
             else {
                 max_so_far = Math.max (curr_sum , max_so_far );
             }
         }
         return max_so_far;
     }

    public static int getSum(int[] a){
        int curr_max = a[0];
        int max_so_far = a[0];
        for (int i = 1 ; i < a.length ;i++) {
            curr_max = Math.max(a[i],curr_max + a[i]);
            max_so_far = Math.max(max_so_far,curr_max);
        }
        return max_so_far;
    }

    public static int maxProduct(int[] nums){
         int max[] = new int[nums.length];
         int min[] = new int[nums.length];
        max[0] = min[0] = nums[0];
        int result = 0;

        for (int i = 1; i < nums.length; i++) {
               if(nums[i] > 0){
                   max[i] = Math.max(nums[i] , nums[i]*max[i-1]);
                   min[i] = Math.min(nums[i] , nums[i]* min[i-1]);
               } else {
                   max[i] = Math.max(nums[i] , nums[i] * min[i-1]);
                   min[i] = Math.min(nums[i],nums[i] * max[i-1]);
               }
            result = Math.max(max[i],result);
        }
        return result;
    }

    public static int maxProductConstantSpace(int[] nums){
        int min_so_far = nums[0];
        int max_so_far = nums[0];
        int curr_max = nums[0];
        int curr_min = nums[0];
         int result = 0;
        for (int i = 1; i < nums.length; i++) {
                if(nums[i] > 0){
                    curr_max = Math.max(nums[i],nums[i] * max_so_far);
                    curr_min = Math.min(nums[i] , nums[i] * min_so_far);

                } else {
                    curr_max = Math.max(nums[i],nums[i] * min_so_far);
                    curr_min = Math.min(nums[i] , nums[i] * max_so_far);
                }
                max_so_far = curr_max;
                min_so_far = curr_min;
            result = Math.max(result,max_so_far);
        }
        return result;
    }
    public static void main(String...args){
        int a[] =  {2,3,-2,4};
        //System.out.println(getLargestSum(a));
        //System.out.println(getSum(a));
        System.out.println(maxProductConstantSpace(a));
    }

}
