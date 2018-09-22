/*This program prompts for information about a loan and computes the
monthly loan payment. */

import java.util.Scanner;

public class Mortgage {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		//obtain values
		System.out.println("This program computes monthly loan payments.");
		System.out.println("Loan amount:");
		double loan = console.nextDouble();
		
		System.out.println("Number of years:");
		int years = console.nextInt();
		
		System.out.println("Interest rate:");
		double rate = console.nextDouble();
		console.close();
		System.out.println();
		
		//Compute result and report
		int n = 12 * years;
		double c = rate / 12.0 / 100.0;
		double payment = loan * c * Math.pow(1 + c, n) / (Math.pow(1 + c, n) - 1);
		System.out.println("Monthly payment is: $" + (int) payment);
	}
}
