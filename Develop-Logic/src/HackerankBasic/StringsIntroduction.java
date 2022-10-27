package HackerankBasic;

import java.util.Scanner;

/*
 	Contoh Input :
 	hello
 	java
 	
 
 	There are three lines of output:
	For the first line, sum the lengths of  and .
	For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
	For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
 	
 	Output :
 	9
 	No
 	Hello Java
 */



public class StringsIntroduction {
	Scanner scan = new Scanner(System.in);
	
	public StringsIntroduction() {
		String a = scan.nextLine();
		String b = scan.nextLine();
		
		int count = 0;
		for(int i = 0; i<a.length(); i++) {
		    if(a.charAt(i) != ' ') { //Kalo index ke i ga null maka lanjut count++
		    	  count++;  
		    }
		}
		
		for(int i = 0; i<b.length(); i++) {
		    if(b.charAt(i) != ' ') { //Kalo index ke i ga null maka lanjut count++
		    	   count++;  	
		    }
		}
		
		System.out.println(count);

		
		if(a.compareTo(b)>0) {
			System.out.println("Yes"); 
		 }
		else {
			System.out.println("No");
		 }
		    
		
		System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase()+ b.substring(1));
		
		//substring (start from index... , to index...)
		
		
	
	}

	public static void main(String[] args) {
		new StringsIntroduction();

	}

}
