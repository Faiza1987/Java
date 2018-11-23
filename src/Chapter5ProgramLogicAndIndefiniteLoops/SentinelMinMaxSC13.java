package Chapter5ProgramLogicAndIndefiniteLoops;

import java.util.Scanner;

/* Write a sentinel loop that repeatedly prompts the user to enter a number and, once the number -1 is typed, displays the maximum and minimum numbers that the user entered. Here is a sample dialogue:

Type a number (or -1 to stop): 5
Type a number (or -1 to stop): 2
Type a number (or -1 to stop): 17
Type a number (or -1 to stop): 8
Type a number (or -1 to stop): -1
Maximum was 17
Minimum was 2
*/

public class SentinelMinMaxSC13 {
	
	public static void main(String[] args) {
		sentinelMinMax();
	}
	
	public static void sentinelMinMax() {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Type a number (or -1 to stop): ");
		int number = console.nextInt();
		
		int min = 2147483647;
		int max = -2147483648;
		
		while(number != -1) {
			
			if(max < number) {
				max = number;
			}
		
			if(min > number) {
				min = number;
			}
			
			System.out.print("Type a number (or -1 to stop): ");
			number = console.nextInt();
			
			if(number == -1) {				
				System.out.println("Maximum was " + max);
				System.out.println("Minimum was " + min);
			}
			
		}

	}
	
	
	
//	public static void sentinelMinMax() {
//		
//		Scanner console = new Scanner(System.in);
//		System.out.print("Type a number (or -1 to stop): ");
//		int number = console.nextInt();

//		int min = 32000000;
//		int max = 0;
//		
//		if(number != -1) {
//			min = number;
//			max = number;
//		}
//		
//		while (number != -1) {
//			if(max < number) {
//				max = number;
//			}
//			// min > number
//			// number <= 0
//			// number != -1
//			
//			if((min > number && number > -1) || (number <= 0 && number != -1)) {
//				min = number;
//			}
//			
//			System.out.print("Type a number (or -1 to stop): ");
//			number = console.nextInt();
//		}
//		
//		System.out.println("Maximum was " + max);
//		System.out.println("Minimum was " + min);
//	
//		console.close();
//	}
}
