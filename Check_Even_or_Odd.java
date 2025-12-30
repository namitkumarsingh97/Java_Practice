// Given a number n, check whether it is even or odd. Return true for even and false for odd.

// Examples: 

// Input: n = 15
// Output: false
// Explanation: 15 % 2 = 1, so 15 is odd

// Input: n = 44
// Output: true
// Explanation: 44 % 2 = 0, so 44 is even
package src;

import java.util.Scanner;

public class Check_Even_or_Odd {
    public static boolean evenOdd(int n) {
        if (n % 2 == 0) {
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

