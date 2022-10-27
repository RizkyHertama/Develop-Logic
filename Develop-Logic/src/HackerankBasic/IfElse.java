package HackerankBasic;

import java.util.Scanner;

/*
 	If n is odd, print Weird
	If n is even and in the inclusive range of 2 to 5 , print Not Weird
	If n is even and in the inclusive range of 6 to 20 , print Weird
	If n is even and greater than 20 , print Not Weird
*/

public class IfElse {
	Scanner scanner = new Scanner(System.in);
	public IfElse() {
		
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        //If odd then print weird        
        if(N%2 != 0){
            System.out.println("Weird");
        }
        
        //If even and has number range between 2 - 5 then print not weird   
        else if(N >= 2 && N <=5 && N%2 == 0) {
        	System.out.println("Not Weird");
        }
        
      //If even and has number range between 6 - 20 then print weird   
        else if(N >= 6 && N <= 20 && N%2 == 0) {
        	System.out.println("Weird");
        }
        
      //If even and has number greater than 20 then print not weird   
        else if(N > 20 && N%2 == 0) {
        	System.out.println("Not Weird");
        }
        scanner.close();
    
	}

	public static void main(String[] args) {
		new IfElse();

	}

}
