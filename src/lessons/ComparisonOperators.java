package lessons;

public class ComparisonOperators {

	public static void main(String[] args) {

		// Use comparison operators to compare numbers
		if (1 == 2)  {
			System.out.println("Numbers are the same");
		}
		
		else  {
			System.out.println("Numbers are NOT the same");
		}
		
		// use .equals() to compare Strings

		// variables
		
		String string1 = "foo";
		String string2 = "bar";
		String string3 = "foo";
		String string4 = "fubar";
		
		if (string1.equals(string3))  {
			
			System.out.println("Strings are the same.");
		}
		
		else  {
			
			System.out.println("Strings are NOT the same.");
		}
		
		
		

	}

}
