import java.util.Scanner;

/**
 * This class allows the user to perform simple arithmetic functions.
 * @author		Astrid Manuel
 * @date		1/28/2015
 */
public class SimpleCalculator {
	
	public static void  main(String[] args) {
		
		// Astrid Manuel, Homework2, 01-28-2015
		
		Scanner sc = new Scanner(System.in);
		
		double firstNumber;
		double secondNumber;
		int choiceOfOperation;
		
		do{
		System.out.printf("Type integer corresponding to the operation you would like to perform.\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus");
		choiceOfOperation = sc.nextInt();
		}while(choiceOfOperation < 1 && choiceOfOperation > 5);
		
		System.out.println("Type in the first number:  ");
		firstNumber = sc.nextDouble ();
		System.out.println ("Type in the second number:  ");
		secondNumber = sc.nextDouble ();
		
		
			if (choiceOfOperation == 1) {
				System.out.println("firstNumber + secondNumber");
			} else if (choiceOfOperation == 2) {
				System.out.println("firstNumber - secondNumber");
			} else if (choiceOfOperation == 3) {
				System.out.println("firstNumber * secondNumber");
			} else if (choiceOfOperation == 4) {
				System.out.println("firstNumber / secondNumber");
			} else if (choiceOfOperation == 5) {
				System.out.println("firstNumber % secondNumber");
			}
	}
}