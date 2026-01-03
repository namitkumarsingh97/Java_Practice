// Problem - Given a positive integer n, we have to find the sum of squares of first n natural numbers
// Input (n) = 2, Output = 1^2 + 2^2 = 5
// Input (n) = 5, Output = 1^2 + 2^2 + 3^2 + 4^2 + 5^2 = 55

// [Basic Approach] - Adding One By One - O(n) Time and O(1) Space - The idea  
// for this naive approach is to run a loop from 1 to n and sum up all the squares. 

package com.namit.practice;
public class Sum_of_Squares_of_Naturals {
	
	static int sumOfSquare(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + (i * i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfSquare(5));	
	}
	
}