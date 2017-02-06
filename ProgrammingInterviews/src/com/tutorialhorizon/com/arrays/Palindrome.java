package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/18/16.
 */
public class Palindrome {

    public Boolean isPalindrome(String s){
           if(s.length() < 2){
               return true;
           }
         if (s.charAt(0) == s.charAt(s.length()-1)){
             return isPalindrome(s.substring(1,s.length()-1));
         }
        else {
             return false;
         }
    }
}
