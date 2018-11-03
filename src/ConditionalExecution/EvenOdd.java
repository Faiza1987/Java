package ConditionalExecution;

import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = input.nextInt();

		input.close();
		
		if(number % 2 == 0) {
			if(number % 3 == 0) {
				System.out.println("Divisible by 6.");
			}
		} else {
			System.out.println("Odd.");
		}
//		if(number % 2 == 0) {
//			System.out.println("even");
//		} else {
//			System.out.println("odd");
//		}
	}
}
