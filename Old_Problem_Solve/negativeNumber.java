package introduction;

import java.util.Scanner;

public class negativeNumber {

	public static void main(String[] args) {
		int flag=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]<0){
				flag=0;
			}
		}
		if (flag==0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

	}}
