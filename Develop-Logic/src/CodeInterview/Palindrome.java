package CodeInterview;

import java.util.Scanner;

/*
 PALINDROME
 
 Example = KODOK <> KODOK
 */

public class Palindrome {
	
	public Palindrome() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input String : ");
		String text = scan.nextLine();
		
		String temp = "";
		
		for(int i = text.length()-1; i>=0; i--) {
			temp = temp + text.charAt(i);
		}
		
		if(text.toLowerCase().equals(temp.toLowerCase())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

	public static void main(String[] args) {
		new Palindrome();
	}

}
