package com.gaylelaakman;

import java.util.Arrays;

/**
 * Created by archithrapaka on 9/10/16.
 */
public class StringCharactersUnique {

    // o(n) and o(1) space
    public static boolean isUnique(String s){

           if(s.length() > 128){
               return false;
           }
        //Arrays.sort(s.toCharArray());

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < s.length(); i++) {
                    if(char_set[s.charAt(i)])
                        return false;
            char_set[s.charAt(i)] = true;
        }
        return true;
    }

    // without using any data structures..

    public static boolean isUnique2(String s){
         int checker = 0;

        for (int i = 0; i < s.length(); i++) {
             int val = s.charAt(i) - 'a';
             if ((checker & (1 << val)) > 0)
                 return false;
            checker |= (1 << val);
        }
        return true;
    }

    // clean and may not be optimal
    public static boolean checkPermutation(String one , String two){
         if(one.length() != two.length()){
             return false;
         }
       return sort(one).equals(sort(two));
    }

    public static boolean checkPermutation2(String one , String two) {
        int[] length = new int[128];

        char[] one_array = one.toCharArray();

        for (int i = 0; i < one.length(); i++) {
                 char c = one.charAt(i);
                 length[c]++;
        }

        for (int i = 0; i < two.length(); i++) {
              char c = two.charAt(i);
              length[c]--;
            if(length[c] < 0){
                return false;
            }
        }
        return true;
    }

    //to be a permutation of palindrome , as string cannot have more than one character with od count
    public static boolean checkPalindromicPermutation(String s){
          int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
          int countOdd = 0;
        for (char c:s.toCharArray()
             ) {
            int x = getCharNumber(c);
            if (x != -1){
                table[x]++;
                if(table[x] % 2 == 1){
                    countOdd++;
                } else {
                    countOdd--;
                }
            }

        }
        return countOdd <= 1;
    }


    public static boolean checkPalindromicPermutation2(String s){
        int[] length = new int[128];

        int countOdd = 0;

       char[] char_set = s.toLowerCase().toCharArray();

        for (char c: char_set
             ) {

             if(Character.isAlphabetic(c)) {
                 length[c]++;

                 if(length[c] % 2 == 1) {
                     countOdd++;
                 } else {
                     countOdd--;
                 }
             }

        }
        return countOdd <= 1;
    }

  // 1.5 one Away
    public static boolean checkOneAway(String one , String two){
          if(Math.abs(one.length() - two.length()) > 1){
              return false;
          }
        String s1 = one.length() > two.length() ? two:one; // smaller string
        String s2 = one.length() > two.length() ? one:two; // larger string

        int idx1 = 0;
        int idx2 = 0;
        boolean foundDiff = false;
        while (idx1 < s1.length() && idx2 < s2.length()){
             if(s1.charAt(idx1) != s2.charAt(idx2)){
                    if(foundDiff)
                        return false;
                  foundDiff = true;

                 if(s1.length() == s2.length()){
                     idx1++;
                 }
                 else {
                     idx1++;
                 }
             }
            idx2++; // always move shorter pointer
        }
        return true;
    }

    // one Away variant , conevrting one string A to another String B in min operations..
    public static int minOps(String A , String B){
           int m = A.length();
           int n = B.length();
        if(n != m){
            return -1;
        }
        int[] count = new int[256];

        // store count for A
        for (int i = 0; i < m; i++) {
            count[A.charAt(i)]++;
        }

        // verify character count for B
        for (int i = 0; i < n; i++) {
             count[B.charAt(i)]--;
              if(count[B.charAt(i)] < 0)
                  return -1;
        }

        // calculate number of operations required

        int res = 0;

        for (int i = n-1, j = n-1; i >= 0;) {
              while (i >=0 && A.charAt(i) != B.charAt(j)){
                   i--;
                   res++;
              }
              if(i>=0){
                  i--;
                  j--;
              }
        }
        return res;
    }

    // 1.9 String Rotation , chck if s2 is rotation of s1

    public static boolean isRotation(String s1 , String s2){
         if(s1.length() != s2.length())
             return false;
        return s1.concat(s1).indexOf(s2) >= 0;
    }

    //

    // sort and return the string
    static String sort(String s){
        char[] seq = s.toCharArray();
        Arrays.sort(seq);
        return new String(seq);
    }

    static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        int val = Character.getNumericValue(c);

        if(a <= val && val <= z){
            return val - a;
        }
        return -1;
    }

    public static void main(String...args){
         String s  = "abcABCZz";
        //System.out.print(isUnique2(s));
        //bitManip();
        String one = "eacbd";
        String two = "eabcd";
        //System.out.println((int) 'a');
        String s2 = "Tact Coa";
        //System.out.println(checkPalindromicPermutation(s2));
        //System.out.println(checkPalindromicPermutation2(s2));
        //System.out.println(minOps(one,two));
        System.out.println(isRotation("waterbottle","erbottlewat"));
    }
}
