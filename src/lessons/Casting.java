package lessons;

public class Casting {

	public static void main(String[] args) {

		// casting means changing from one data type to another
		
		// int to String
		String myString1 = "";
		int myInteger1 = 13;
		myString1 = Integer.toString(myInteger1);
		System.out.println(myString1);
		
		// String to int 
		String myString2 = "78";
		int myInteger = Integer.parseInt(myString2);
		System.out.println(myString2);
		
		// double to String
		String myString3 = "";
		double myDouble1 = 13.3;
		myString3 = Double.toString(myDouble1);
		System.out.println(myString3);
		
		// String to double
		String myString4 = "6.8";
		double myDouble2;
		myDouble2 = Double.parseDouble(myString4);
		System.out.println(myDouble2);
		
		// int to double
		int myInteger3 = 43;
		double myDouble3;
		myDouble3 = myInteger3;   // automatically promotes to double, no data lost
		myDouble3 = (double)myInteger3;
		System.out.println(myDouble3);
		
		// double to int
		double myDouble4 = 15.9;
		int myInteger4;
		myInteger4 = (int)myDouble4;  // ** this will TRUNCATE, NOT ROUND
		System.out.println(myInteger4);
	
	}

}
