package HackerankBasic;

import java.util.Scanner;

public class OutputFormatting {

	public OutputFormatting() {
		Scanner scan = new Scanner(System.in);
		System.out.println("================================");
		for(int i=0; i<3; i++) { 
			String s1 = scan.nextLine();
			int x = scan.nextInt();
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
		}
		System.out.println("================================");
	}

	public static void main(String[] args) {
		new OutputFormatting();

	}

}
