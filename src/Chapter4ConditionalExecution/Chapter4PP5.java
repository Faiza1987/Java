package Chapter4ConditionalExecution;

import java.util.Scanner;

/*A new tax law has just been passed by the government: the first $3,000 of income is free of tax,
the next $5,000 is taxed at 10%, the next $20,000 is taxed at 20%, and the rest is taxed at 30%.
Write an interactive program that prompts for a user's income and reports the corresponding
tax.*/

public class Chapter4PP5 {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter your income: $ ");
		
		double income = console.nextDouble();
		double taxAmount = 0;
		
		
		if(income <= 3000) {
			taxAmount += 3000 * 0.0;

		} else if(income > 3000 && income <= 8000) {
			taxAmount += 3000 * 0.0;
			taxAmount += (income - 3000) * 0.10;
	
		} else if(income > 8000 && income <= 28000) {
			taxAmount += 3000 * 0.0;
			taxAmount += 5000 * 0.10;
			taxAmount += (income - 8000) * 0.20;

		} else {
			taxAmount += (5000 * 0.10) + (20000 * 0.20);
			taxAmount += (income - 28000) * 0.30;
		}
		
		System.out.println(taxAmount);
		
		//BREAKDOWN #1
//		//tax on first $28,000 of income
//		taxAmount += (5000 * 0.10) + (20000 * 0.20);
//		
//		//tax on remaining income
//		taxAmount += (income - 28000) * 0.30;
//		System.out.println(taxAmount);
		
		//BREAKDOWN #2
//		//tax on first 3k of income
//		taxAmount += 3000 * 0;
//		income -= 3000;
//		
//		//tax on next 5k of income
//		taxAmount += 5000 * 0.10; //500
//		income -= 5000;
//		
//		//tax on next 20k of income
//		taxAmount += 20000 * 0.20; //4,500
//		income -= 20000;
//		
//		//tax on Remaining income
//		taxAmount += income * 0.30; //3,600
//		
//		//report
//		System.out.println(taxAmount);
	}
}
