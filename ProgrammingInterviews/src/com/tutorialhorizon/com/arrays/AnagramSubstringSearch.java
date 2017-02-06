package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/21/16.
 */
public class AnagramSubstringSearch {

    public static void findAnagram(String text , String pattern){
        int n = text.length();
        int p = pattern.length();

        int j = 0;
        int pHash = 0;

        for (int i = 0; i < p; i++) {
            pHash += pattern.charAt(i);
        }

        int hash = 0;
        for (int i = 0; i < n; i++) {
            hash += text.charAt(i);
                if(hash == pHash){
                    System.out.println("found at :" + i);
                    break;
                }
        }
    }

    public static void main(String...args){
        findAnagram("bacdg","bcda");
    }
}
