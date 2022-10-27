package CodeInterview;

import java.util.Scanner;

public class FizzBuzzChecker {

	public FizzBuzzChecker() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the total number you want to check : ");
		int total = scan.nextInt();
		for(int i=0; i<total; i++) {
			System.out.print("Enter the number : ");
			int number = scan.nextInt();
			if(number%3 ==0 && number%5==0) {
				System.out.println("Fizz Buzz");
			}
			else if(number%3==0) {
				System.out.println("Fizz");
			}
			else if(number%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(number);
			}
		}
		
	}

	public static void main(String[] args) {
		new FizzBuzzChecker();

	}

}
