package lessons;

public class Rounding {

	public static void main(String[] args) {

		// Integer rounding
		double price = 13.579;
		
		// to round to nearest penny, move decimal to the
		// right of the penny position
		price = price * 100;
		
		// now round to nearest integer
		price = Math.round(price);
		
		// move decimal back to original position
		price = price/100;
		
		System.out.println(price);
	}

}
