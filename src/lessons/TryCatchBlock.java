package lessons;
import java.util.Scanner;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int answer = 0;

		System.out.println("Welcome to add calculator!\n");
		System.out.println("Enter first integer: ");

		try  {
			
			num1 = sc.nextInt();	
		}
		
		catch(Exception e)  {
			
			System.out.println("Incorrect entry, try again.");
			System.exit(0);
		}

		System.out.println("Enter second integer: ");

		try  {
			
			num2 = sc.nextInt();	
		}
		
		catch(Exception e)  {
			
			System.out.println("Incorrect entry, try again.");
			System.exit(0);
		}
		
		// processing
		answer = num1 + num2;
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + answer);
		
		
	}

}
