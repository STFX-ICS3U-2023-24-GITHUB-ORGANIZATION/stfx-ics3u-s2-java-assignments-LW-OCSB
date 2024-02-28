package lessons;
import java.util.Scanner;

public class InputErrorCheckCLI {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int myInteger = 0;
		boolean validEntry = false;
		String temp = "";
		

		while (validEntry == false)  {
			
			System.out.println("Enter an integer: ");
			
			try {
				
				temp = sc.nextLine();
				myInteger = Integer.parseInt(temp);
				
				//myInteger = sc.nextInt();
				validEntry = true;
			}
			
			catch (Exception e)  {
				
				System.out.println("Invalid entry, please try again.");
			}
		}
		
		
		
		System.out.println("You entered " + myInteger);

		

	}

}
