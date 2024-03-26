package lessons;
import java.util.Scanner;

public class SwitchIntegers {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("Enter choice (A, B or C): ");
		choice = sc.nextInt();
		
		switch(choice)  {
		
			case 1: 
				System.out.println("You selected 1.");
				System.out.println("Have fun with number 1.");
				break;
				
			case 2: 
				System.out.println("You selected 2.");
				System.out.println("Have fun with number 2.");
				break;
				
			case 3: 
				System.out.println("You selected 3.");
				System.out.println("Have fun with number 3.");	
				break;
				
			default:
				System.out.println("You entered something else.");
				break;
				
		}
	
	
			
		
		
	}

}
