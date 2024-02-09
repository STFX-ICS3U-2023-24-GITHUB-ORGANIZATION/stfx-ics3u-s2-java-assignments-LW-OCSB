package lessons;

import java.util.Scanner;

public class GradeValidityChecker {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		// output
		System.out.println("Enter grade to check: ");
		input = sc.nextInt();
		
		
		if ( (input < 0)  ||  (input > 100) )  {
//		if ( (input >= 0 ) && (input <= 100) )  {
			
			System.out.println("This is NOT a valid grade.");
		}
		
		else {
			
			System.out.println("This is a valid grade.");
		}
		

	}

}
