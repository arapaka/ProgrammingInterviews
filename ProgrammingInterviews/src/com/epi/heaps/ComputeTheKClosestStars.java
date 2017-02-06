package com.epi.heaps;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by archithrapaka on 8/24/16.
 */
public class ComputeTheKClosestStars {

    public static class Star implements Comparable<Star> , Serializable{

        private double x,y,z;

        public Star(double x, double y , double z){
              this.x = x;
              this.y = y;
              this.z = z;
       }

       public double distance(){
           return Math.sqrt(x*x + y*y + z*z);
       }

        @Override
        public int compareTo(Star other) {
            return Double.compare(this.distance(),other.distance());
        }
    }

    public static List<Star> findClosestKStars(int k , Star[] a){
        // declaring a maxHeap

        PriorityQueue<Star> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());

        int i = 0;
        try{

            while (true){
                 Star star = a[i];
                maxHeap.add(star);
                i++;
                if (maxHeap.size() == k+1){
                    maxHeap.remove();
                }
            }

        } catch(Exception e){
            // do nothing since the end of array has reached ,exiting from while..
        }
        List<Star> orderedStars = new ArrayList<Star>(maxHeap);
        // the only gurantee the Priority Queue makes is about max element
        Collections.sort(orderedStars);
        return orderedStars;
    }

    public static void main(String...args){

    }
}
