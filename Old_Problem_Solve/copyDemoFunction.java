package introduction;

public class copyDemoFunction {

	public static void main(String[] args) {
		int num1, num2, result;
		System.out.print("Enter 2 Values");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		result = sum(num1, num2);
		System.out.print("Addition of 2 numbers is: " + result);
	}
	public static int sum(int num1, int num2) {
		int num3;
		num3 = num1 + num2;
		return num3;
	}

	public final static Scanner sc = new Scanner(System.in);
}