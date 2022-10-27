package HackerankBasic;

import java.util.Scanner;
/*

*The username consists of 8 to 30 characters inclusive. 
*If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.

*The username can only contain alphanumeric characters and underscores (_). 
*Alphanumeric characters describe the character set consisting of lowercase characters [a-z] , uppercase characters [A-Z] , and digits [0-9] .

*The first character of the username must be an alphabetic character, i.e., either lowercase character [a-z] or uppercase character [A-Z]. 
*/

public class ValidUsernameREX {
	Scanner scan = new Scanner(System.in);
	
	
	 static String texto = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
	 public static final String regularExpression = texto;
	
	public ValidUsernameREX() {
		int n = scan.nextInt();
		
		for(int i = 0; i<=n; i++) {
			String name = scan.nextLine();
			if(name.matches(regularExpression)) {
				System.out.println("Valid");
			}
			else {
				System.out.println("Invalid");
			}
		}
	

		
	}

	public static void main(String[] args) {
		new ValidUsernameREX();

	}

}
