package CodeInterview;

import java.util.Scanner;

/*
 FACTORIAL

 5! = 5 x 4 x 3 x 2 x 1 = 120
 
*/

public class Factorial {
	
	public Factorial() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		int factorial = 1;

		for(int i=1; i<=num; i++ ) {
			factorial = factorial*i;
		}
		
		System.out.println("Factorial Number From " + num + " is " + factorial);
	}

	public static void main(String[] args) {
		new Factorial();

	}

}
