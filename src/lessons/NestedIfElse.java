package lessons;
import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
	
		// variables
		Scanner sc = new Scanner(System.in);
		String menuOptions = "";
		String meatChoice = "";
		
		System.out.println("Meat (M) or Vegetarian (V) menu?");
		menuOptions = sc.next();
		
		// Meat menu was selected
		if (menuOptions.equals("M"))  {
			
			System.out.println("You selected meat.");
			System.out.println("Chicken (C), or Fish (F)?");
			meatChoice = sc.next();
			
			// THIS IS A NESTED IF STATEMENT
			if (meatChoice.equals("C"))  {
				System.out.println("KFC will be served.");
			}
			
			else if (meatChoice.equals("F"))  {
				System.out.println("Fillet O Fish will be served.");
			}
			
		}
		
		// Vegetarian menu was selected
		else if (menuOptions.equals("V"))  {
			
			System.out.println("You selected vegetarian.");
		}
		
		
	}

}
