package CodeInterview;

import java.util.Scanner;

/*
FACTORIAL

5! = 5 x 4 x 3 x 2 x 1 = 120

*/


public class FactorialRecursive {

	public FactorialRecursive() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Input number : ");
		num = sc.nextInt();
		System.out.println("Factorial of " + num + " = " + MultiplyNum(num));
		
	}
	
	
	int MultiplyNum(int num) {
		if(num <= 1) {
			return 1;
		}
		else {
			return num*MultiplyNum(num -1);
		}
	}

	public static void main(String[] args) {
		new FactorialRecursive();

	}

}
