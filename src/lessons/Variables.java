package lessons;

// Class names are always capitalized!!!
public class Variables { 

	public static void main(String[] args)  {

		// variables follows "camelCase" convention
		int myInteger = 0;
		double myBankAccountBalance = 0.0;
		boolean myBoolean1 = true;
		boolean myBoolean2 = false;
		char myCharacter1 = 'z';   // within single quotes
		char myCharacter2 = '#';
		char myCharacter3 = ' ';
		String myString1 = "";   // empty String
		String myString2 = "hippopotamus";
		String myString3 = " ";
		String myString4 = "Hello World!";
		
		// CONSTANT Variables are all capitalized
		// different words are separated using underscore
		final double TAX_RATE = 0.13;
		
		myBankAccountBalance = 1000000;  // modifiable
		//TAX_RATE = 0.16;  // error, we can't modify
		
	}

}
