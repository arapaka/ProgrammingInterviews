package com.warmup.epi;


public class FizzBuzz {

	public static void printFizzBuzz(int x){
		 
		for(int i=0;i<=x ;i++ ) {
			String s= "";
			s +=  (i %3 == 0) ? "Fizz " : "";
			s += (i %5 == 0) ? "Buzz" : "";
			System.out.println(!s.isEmpty() ? s:i);
		}
		
	}
	
	public static void main(String[] args ){
		printFizzBuzz(10);
	}
}
