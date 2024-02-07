package lessons;
import java.util.Scanner;  // import Scanner library for user input


public class UserInput {

	public static void main(String[] args) {

		// variables
		int myInteger = 0;
		Scanner sc = new Scanner(System.in);
		
		// output
		System.out.println("Enter an integer: ");
		
		// input
		myInteger = sc.nextInt();
		
		// print contents of variable
		System.out.println("You entered: " + myInteger);
		
		
		
		
	}

}
