// Given a number n, we need to print its table.

package com.namit.practice;

public class Multiplication_Table {
	
	public static void table(int n) {
		for (int i=1; i<11; i++) {
			System.out.println(n + " * " + i + " = " + n * i); 
		}
	}
	
	public static void main(String[] args) {
		table(2);
	}

}