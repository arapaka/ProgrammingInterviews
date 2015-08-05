package com.warmup.epi;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatedCharacters {

	public static String getLongestSubstring(String input) {
		 HashSet<Character> set = new HashSet<Character>();

	        String OverAll = "";
	        String Current = "";

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);

	            if (set.contains(c)) {
	                Current = "";
	                set.clear();
	            }
	            Current += c;
	            set.add(c);
	            if (Current.length() > OverAll.length()) {
	                OverAll = Current;
	            }
	        }

	        return OverAll;
	 
	 
}
	
	//Testing class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aBBBCd";
        System.out.println(getLongestSubstring(input));
	}

}
