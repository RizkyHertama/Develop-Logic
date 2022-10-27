package CodeInterview;

/*
 FIZZ BUZZ 
 
 *If number can divide by 3 then print "fizz"
 *If number can divide by 5 then print "buzz"
 *If number can divide by 3 & 5 then print "fizz buzz"

*/

public class FizzBuzz {

	void FizzBuzzTest(int n) {
		for(int i=0; i<n; i++) {
			if(i%3 ==0 && i%5==0) {
				System.out.println("Fizz Buzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	public FizzBuzz() {
		FizzBuzzTest(100);
	}
	

	public static void main(String[] args) {
		new FizzBuzz();
	}

}
