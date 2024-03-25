package lessons;
import java.util.Scanner;

public class SwitchLetters {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String input = "";

		System.out.println("Enter choice (A, B or C)");
		input = sc.next();
		
		switch(input)  {
		
		case "A": case "a": case 1:
			System.out.println("You entered A");
			break;
			
		case "B":
			System.out.println("You entered B");
			break;
			
		case "C":
			System.out.println("You entered C");
			break;
			
		default:
			System.out.println("You entered something else.");
			break;
		}
		
		
	}

}
