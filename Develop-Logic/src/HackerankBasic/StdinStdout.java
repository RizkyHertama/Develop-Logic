package HackerankBasic;


import java.util.Scanner;

/*
	There are 3 lines of input, and each line contains a single integer.
	
	Contoh Input :
	42
	100
	125
	
	Output :
	42
	100
	125
*/

public class StdinStdout {
	Scanner scanner = new Scanner(System.in);
	
	public StdinStdout() {
//	int a = scanner.nextInt();
//	int b = scanner.nextInt();
//	int c = scanner.nextInt();
//	
//	System.out.println(a);
//	System.out.println(b);
//	System.out.println(c);
	
	//kalo mau pake loop
	for(int i=0; i<3; i++){
		System.out.println(scanner.nextInt() + "\n");
		}
	
	}

	public static void main(String[] args) {
		new StdinStdout();

	}

}
