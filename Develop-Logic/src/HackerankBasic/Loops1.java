package HackerankBasic;

import java.util.Scanner;

/*
 	Contoh Input :
 	2
 	
 	Output :
 	2 x 1 = 2
	2 x 2 = 4
	2 x 3 = 6
	2 x 4 = 8
	2 x 5 = 10
	2 x 6 = 12
	2 x 7 = 14
	2 x 8 = 16
	2 x 9 = 18
	2 x 10 = 20
 	
 */

public class Loops1 {
	Scanner scan = new Scanner(System.in);
	
	public Loops1() {
		int N = scan.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(N + " x " + i + " = " + N*i);
		}
	}

	public static void main(String[] args) {
		new Loops1();

	}

}
