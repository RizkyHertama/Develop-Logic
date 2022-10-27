package HackerankBasic;

import java.util.Scanner;

public class EndOfFile {

	public EndOfFile() {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		
		for(int i=0; scan.hasNextLine(); i++) {
			System.out.println(i + scan.nextLine());
		}
		
		
		

	}

	public static void main(String[] args) {
		new EndOfFile();

	}

}
