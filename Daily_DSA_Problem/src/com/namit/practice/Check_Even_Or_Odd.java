	// Given a number n, check whether it is even or odd. Return true for even and false for odd.

	// Examples: 

	// Input: n = 15
	// Output: false
	// Explanation: 15 % 2 = 1, so 15 is odd

	// Input: n = 44
	// Output: true
	// Explanation: 44 % 2 = 0, so 44 is even

//package com.namit.practice;
//
//public class Check_Even_Or_Odd {
//	    public static boolean evenOdd(int n) {
//	        if (n % 2 == 0) {
//	            return true;
//	        } else {
//	            return false;
//	        }
//	    }
//	    public static void main(String[] args) {
//	        System.out.println(evenOdd(15));
//	        System.out.println(evenOdd(44));
//	    }
//}

// - This was a easy way, now second approach is we have 'Using Bitwise AND Operator' - O(1) Time and O(1) Space.
// - The last bit of all odd numbers is always 1, while for even numbers it’s 0. So, when performing bitwise AND operation with 1, odd numbers give 1, and even numbers give 0.
// - Since computer understands only binary so it will be easy for it to understand and give output in much faster way

// - Rule for AND Operator: 
// 1. 1 & 1 = 1
// 2. All other combinations = 0; [1 & 0 | 0 & 1 | 0 & 0]

// Lets take example of a number - 15 -> in binary -> 1 1 1 1 
// we will perform AND Operation of of above binary with 1
//   1 1 1 1	
// & 0 0 0 1
// ---------
//   0 0 0 1 -> hence its an odd number

// now lets check this through code -

package com.namit.practice;

public class Check_Even_Or_Odd {
	    public static boolean evenOdd(int n) {
	        if ((n & 1) == 0) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    public static void main(String[] args) {
	        System.out.println(evenOdd(15));
	        System.out.println(evenOdd(44));
	    }
}



















