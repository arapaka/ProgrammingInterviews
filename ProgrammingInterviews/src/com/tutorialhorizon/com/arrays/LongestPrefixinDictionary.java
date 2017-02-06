package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/18/16.
 */
public class LongestPrefixinDictionary {

    public static String getLongestPrefix(String[] a){
        StringBuilder sb = new StringBuilder("");
        int resultLen = a[0].length();
        int curr = 0;

        for (int i = 1; i < a.length; i++) {
             while (curr < resultLen && a[0].charAt(curr) == a[i].charAt(curr)){
                 curr++;
             }
            resultLen = curr;
        }
        return a[0].substring(0,curr);
    }

    public static void main(String ...args){
  String[] a = {"archit","arsi","arch","archy","ary"};
        System.out.println(getLongestPrefix(a));
    }
}
