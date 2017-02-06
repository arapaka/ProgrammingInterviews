package com.codechef.beginner;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by archithrapaka on 10/31/16.
 */
public class ONP {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // test cases
         sc.nextLine();
        while (T > 0) {
            String s = sc.nextLine();
            Stack<Character> ops = new Stack<>();
            Stack<String> vals = new Stack<>();

            String result = "";
            for (int i = 0; i < s.length(); i++) {
                   if(s.charAt(i) == '('){
                       // do nothing
                   }

                   if(s.charAt(i) == ')'){
                      char op = ops.pop();
                       String v = vals.pop();
                       v = vals.pop() + v + op;
                       vals.push(v);
                   }
                else if(Character.isLetter(s.charAt(i))){
                         vals.push(s.charAt(i) + "");
                   }
                else if(s.charAt(i) != '(' && s.charAt(i) != ')'){
                       ops.push(s.charAt(i));
                   }
            }
          System.out.println(vals.pop());
           T--;
        }
    }
}
