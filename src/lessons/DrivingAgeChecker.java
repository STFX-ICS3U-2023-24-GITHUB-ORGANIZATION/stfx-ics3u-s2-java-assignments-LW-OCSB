package lessons;

import java.util.Scanner;  // for input

public class DrivingAgeChecker {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int age = 0;
		
		// output
		System.out.println("Driving Age Checker Program.");
		System.out.println("\nPlease enter your age: ");
		
		// input
		age = sc.nextInt();
		
		
		if ( age < 16 )  {
			
			System.out.println("You're too young to drive.");	
		}
		
		else  {
			
			System.out.println("You're old enough to drive.");
		}
		
		
		
	}

}
