package lessons;
import java.util.Scanner;   // for user input


public class UserInput2 {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int myInteger = 0;
		double myDouble = 0.0;
		char myChar;  // not initialized
		String myString = "";

		/*
		// get int
		System.out.println("Please enter an integer: ");
		myInteger = sc.nextInt();
		
		// get double
		System.out.println("Please enter an double: ");
		myDouble = sc.nextDouble();
	*/
		
		// get String
		System.out.println("Please enter a String: ");
		myString = sc.nextLine();
	
		System.out.println("You entered: " + myString);
		

	}

}
