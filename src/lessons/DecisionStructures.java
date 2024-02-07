package lessons;

public class DecisionStructures {

	public static void main(String[] args) {

		/* 
		 	Comparison operators:
			> Greater than
			< Less than
			>= Greater than or equal to
			<= Less than or equal to 
			== equal to
			!= not equal to
		*/

		// variables
		int num1 = 7;
		int num2 = 13;
		int num3 = 13;
		
		// > Greater than
		if ( num1 > num3 )  {
	
			System.out.println(num2 + " is greater than " + num1);
		}
		
		else {
			
			System.out.println(num2 + " is NOT greater than " + num1);
		}
		
		// < Less than
		if (num1 < num2)  {
			System.out.println(num1 + " is LESS than " + num2);
		}
		
		else  {
			System.out.println(num1 + " is NOT LESS than " + num2);
		}

	}

}
