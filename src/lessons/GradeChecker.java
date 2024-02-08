package lessons;
import java.util.Scanner;


public class GradeChecker {

	public static void main(String[] args) {

		// create new Scanner object for user input
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		
		// ask user for grade
		System.out.println("Grade Checker\n");
		System.out.println("Enter your grade: ");
		
		// input
		grade = sc.nextInt();
		

		if (grade < 50)  {
			
			System.out.println("F");
		}
		
		else if (grade < 60) {
			
			System.out.println("1");
		}
		
		else if (grade < 70)  {
		
			System.out.println("2");
		}
		
		else if (grade < 80)  {
			
			System.out.println("3");
		}
		
		else if (grade < 90)  {
			
			System.out.println("4");
		}
		
		else  {
			
			System.out.println("4+");
		}
	}

}
