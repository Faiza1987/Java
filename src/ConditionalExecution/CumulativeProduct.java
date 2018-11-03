package ConditionalExecution;

import java.util.Scanner;

public class CumulativeProduct {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers? ");
		int number = console.nextInt();
		
		int product = 1;
		
		for(int i = 1; i <= number; i++) {
			System.out.print("Next number --> ");
			int next = console.nextInt();
			product *= next; 
		}
		System.out.print("Product = " + product);
		console.close();
	}
}
