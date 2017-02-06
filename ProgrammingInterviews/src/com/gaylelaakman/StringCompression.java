package com.gaylelaakman;

/**
 * Created by archithrapaka on 9/8/16.
 */
public class StringCompression {

    public static void compressString(String s){

        int i = 0;
        int j = 1 , count = 0;

        StringBuffer sb = new StringBuffer("");
        for (i = 0; i < s.length(); i++) {
            count++;
            if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
                      sb.append(s.charAt(i)+""+count);
                     count = 0;
                 }

        }
       System.out.print(sb.toString());
    }


    public static void main(String...args){
        String s = "aaabbbccd";
        compressString(s);
    }
}
