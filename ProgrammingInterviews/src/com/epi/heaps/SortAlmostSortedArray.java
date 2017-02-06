package com.epi.heaps;

import java.io.IOException;
import java.util.PriorityQueue;

/**
 * Created by archithrapaka on 8/24/16.
 * question 11.3 , page 174
 * Read a input sequence with a property that every number is almost k AWAY from its original sorted position.
 *
 */
public class SortAlmostSortedArray {
    //Naive solution would be to use a o(nlogn) sorting algo , but we can do better..

    public static void sortApproximatelySortedData(int[] a , int k) throws ClassNotFoundException , IOException {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        try{
            //ObjectInputStream osin = new ObjectInputStream(seq);

            // add first k elements to the min heap and stop if there are fewer than k ..

            for (int i = 0; i < k; i++) {
                minHeap.add(a[i]);
            }



            // for every new element added to the min heap , extract the smallest(top) and print it ..
              int i = k;

            while (true){
                minHeap.add(a[i]);
                i++;
                Integer smallest = minHeap.remove();
                System.out.println(smallest);
            }
        } catch (Exception e){
            // exception do nothing
        }


        // print remaining elements...
        while (!minHeap.isEmpty()){
            Integer smallest = minHeap.remove();
            System.out.println(smallest);
        }
    }

    public static void main(String...args) throws IOException, ClassNotFoundException {
      int[] test =  {3,-1,2,6,4,5,8};
        sortApproximatelySortedData(test,2);
    }
}
