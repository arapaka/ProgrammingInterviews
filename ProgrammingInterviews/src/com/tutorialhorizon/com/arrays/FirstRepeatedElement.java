package com.tutorialhorizon.com.arrays;

import java.util.HashSet;

/**
 * Created by archithrapaka on 10/24/16.
 */
public class FirstRepeatedElement {


    // first repeated element with index

    public void findFirst(int[] a){
        HashSet<Integer> set = new HashSet<Integer>(a.length);

        int index = 0;
        for (int i = a.length-1; i >= 0; i--) {
                  if(set.contains(a[i])){
                      index = i;
                  }
                  else {
                      set.add(a[i]);
                  }

        }
       System.out.print(a[index]);
    }


    public static void main(String... args){

    }
}
