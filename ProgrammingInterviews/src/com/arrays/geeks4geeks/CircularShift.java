package com.arrays.geeks4geeks;

/**
 * Created by archithrapaka on 7/1/16.
 */
public class CircularShift {

    static boolean checkCircularShift(String s,String t){
        return (s.length() == t.length()) && (s.concat(s).indexOf(t) >= 0);
    }
}
