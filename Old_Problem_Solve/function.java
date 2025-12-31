package introduction;

import java.util.Scanner;

public class function {
	//int sum(int, int);
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int result= sum(num1, num2);
	System.out.println(result);
	}
public static int sum(int num1, int num2) {
	int num3 = num1 + num2;
	return num3;
}
}
