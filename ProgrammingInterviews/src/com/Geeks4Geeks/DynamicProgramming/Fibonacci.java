package com.Geeks4Geeks.DynamicProgramming;

/**
 * Created by archithrapaka on 10/27/16.
 */
public class Fibonacci {

    static int[] f = new int[1000];

    public static void fibonacci(int n){
          if(n <=1){
              System.out.print(1);
              return;
          }

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
              c = a+b;
              a = b;
              b = c;
        }
        System.out.print("the " + n + "th  fibonacci number is : " + c);
    }


    // o(logn) implementation

    static int fib(int n){
         if(n == 0){
             return 0;
         }

        if(n ==1 || n == 2){
            return (f[n] = 1);
        }

          if(f[n] != 0){
              return f[n];
          }

        int k = (n % 2 == 0) ? n/2 : (n+1)/2;

        f[n] = (n % 2 == 0) ? (2*fib(k-1) + fib(k))*fib(k) : (fib(k)*fib(k) + fib(k-1)*fib(k-1));

        return f[n];
    }

    public static void main(String...args){
        fibonacci(60);
        System.out.println();
        System.out.println(fib(60));
    }
}
