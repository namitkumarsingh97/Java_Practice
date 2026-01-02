// Given a positive integer n, find the sum of the first n natural numbers
// Input (n) = 5, Output = 1 + 2 + 3 + 4 + 5 = 15 

// [Basic Approach] Using Loop - O(n) Time and O(1) Space

//package com.namit.practice;
//
//public class Sum_Of_Naturals {
//	    static int sum(int n) {
//	        int sum = 0;
//	        for (int i=1; i<=n; i++) {
//	        	sum = sum + i;
//	        }
//	        return sum;
//	    }
//	    
//	    public static void main(String[] args) {
//	        System.out.println(sum(5));
//	    }
//}

// [Expected Approach] Formula Based Method - O(1) Time and O(1) Space
// Formula -> Sum of first n natural numbers = (n * (n+1)) / 2

package com.namit.practice;

public class Sum_Of_Naturals {
	    
	static int findSum(int n) {
	        int output = (n * (n+1)) / 2;
			return output;
	    }
	    
	    public static void main(String[] args) {
	        System.out.println(findSum(5));
	    }

}




