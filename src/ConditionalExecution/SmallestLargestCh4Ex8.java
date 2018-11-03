package ConditionalExecution;

import java.util.Scanner;

/*
Write a method named smallestLargest that asks the user to enter numbers, then prints the smallest and largest of all the numbers typed in by the user. You may assume the user enters a valid number greater than 0 for the number of numbers to read. Here is an example dialogue:

How many numbers do you want to enter? 4
Number 1: 5
Number 2: 11
Number 3: -2
Number 4: 3
Smallest = -2
Largest = 11
*/

public class SmallestLargestCh4Ex8 {
	public static void main(String[] args) {
		smallestLargest();
	}
	
	public static void smallestLargest() {
		
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers do you want to enter? ");
		int num = console.nextInt();
		int minNum = 32000000;
		int maxNum = 0;
		
		for(int i = 1; i <= num; i++) {
			System.out.print("Number " + i + ": ");
			int nextNum = console.nextInt();
						
			if(maxNum < nextNum) {
				maxNum = nextNum;
			} 
			
			if (minNum >= nextNum){
				minNum = nextNum;
			}
		}
		System.out.println("Min num: " + minNum);
		System.out.println("Max num: " + maxNum);
		
		console.close();
	}
}
