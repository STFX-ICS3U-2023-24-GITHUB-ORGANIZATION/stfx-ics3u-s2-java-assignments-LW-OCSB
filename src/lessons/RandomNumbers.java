package lessons;

public class RandomNumbers {

	public static void main(String[] args) {
		
		// Math.random() generates random decimal between 0 and 1
		System.out.print("Output of Math.random():\t\t");
		System.out.println(Math.random());
		
		// To generate a random number, multiply by n
		// Generates a "double" > 0 and < n
		int n = 3;
		System.out.print("Output of Math.random() x integer:\t");
		System.out.println(   Math.random() * n   );
		
		// Casting product to an integer will TRUNCATE the decimal
		// Generates an int between 0 and n-1
		System.out.print("Output of casting:\t\t\t");
		System.out.println(   (int)(Math.random() * n)   );
		
		// Add 1 to n, will increase the upper range to n.
		// This does not change the lower end of 0
		// Range generated is 0 to n.
		System.out.print("Output of increasing n by 1:\t\t");
		System.out.println(   (int)(Math.random() * (n+1))   );

		// By adding 1 to the product, we generate int from 1 to n
		System.out.print("Output of increasing product by 1:\t");
		System.out.println(   (int)(Math.random() * n)  + 1  );
		
	}

}
