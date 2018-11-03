// Finds the sum of a sequence of numbers

package ConditionalExecution;

import java.util.*;

public class ExamineNumbers1 {
	public static void main(String[] args) {
		
	// CUMULATIVE SUM
//		System.out.println("This program adds a sequence of numbers.");
//		System.out.println();
//		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("How many numbers do you want me to examine? ");
//		int totalNumber = input.nextInt();
//		
//		double sum = 0.0;
//		
//		for(int i = 1; i <= totalNumber; i++) {
//			System.out.print("#" + i + "? ");
//			double next = input.nextDouble();
//			sum += next;
//		}
//		System.out.println();
//		System.out.println("Sum = " + sum);
//		input.close();
		
	//CUMULATIVE PRODUCT
		System.out.println("This program multplies a sequence of numbers.");
		System.out.println();
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("How many numbers do you want me to examine.");
		int totalNumber = console.nextInt();
		
		int product = 1;
		
		for(int i = 1; i <= totalNumber; i++) {
			System.out.println("#" + i + "? ");
			int next = console.nextInt();
			product *= next;
		}
		System.out.println();
		System.out.println("Product = " + product);
		console.close();
	}
}
