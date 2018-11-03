package ConditionalExecution;

/* Write a method named evenSum that prompts the user for many integers and print the total even sum and maximum of the even numbers. You may assume that the user types at least one non-negative even integer.

how many integers? 4
next integer? 2
next integer? 9
next integer? 18
next integer? 4
even sum = 24
even max = 18

*/

import java.util.Scanner;

public class EvenSumCh4Ex9 {
	public static void main(String[] args) {
		evenSum();
		
	}
	
	public static void evenSum() {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("How many integers? ");
		int num = console.nextInt();
		
		int evenSum = 0;
		int nextNum = 0;
		int maxNum = 0;
		
		for(int i = 1; i <= num; i++) {
			System.out.print("Next integer? ");
			nextNum = console.nextInt();
			
			if(nextNum % 2 == 0) {				
				evenSum += nextNum;
				
				if(maxNum < nextNum) {
					maxNum = nextNum;
				}
			}
		}
			System.out.println("Even sum: " + evenSum);
			System.out.println("Even max: " + maxNum);
		
			console.close();
	}
}
