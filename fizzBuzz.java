package introduction;
import java.io.*; 
import java.util.*;
public class fizzBuzz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N= sc.nextInt();
		for(int i=1;i<=N;i++) {
			if(i%3==0 && i%5!=0) {
				System.out.println("Fizz");
			}
			else if(i%5==0 && i%3!=0) {
				System.out.println("Buzz");
			}
			else if(i%5==0 && i%3==0) {
				System.out.println("FizzBuzz");
			}
			else {
			System.out.println(i);
		}}

	}

}
