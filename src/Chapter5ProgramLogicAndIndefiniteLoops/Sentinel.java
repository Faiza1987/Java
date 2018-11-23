package Chapter5ProgramLogicAndIndefiniteLoops;

import java.util.Scanner;

public class Sentinel {
	public static void main(String[] args) {
		
		/*
		 * sum = 0
		 * prompt & read a value into n
		 * while (n is not the sentinel){ //sentinel is a special value that signals the end of input
		 * 	add n to the sum
		 * 	prompt & read a value into n
		 * }
		 */
		
		Scanner console = new Scanner(System.in);
		
//		int sum = 0;
//		System.out.print("Next integer (-1 to quit)? ");
//		int number = console.nextInt();
//		
//		while(number != -1) {
//			sum += number;
//			System.out.print("Next integer (-1 to quit)? ");
//			number = console.nextInt();
//		}
//		System.out.println("Sum = " + sum);

		// OR...using break
		
		int sum = 0;
		
		while(true) {
			
			System.out.print("Next integer (-1 to quit)? ");
			int number = console.nextInt();
	
			if(number == -1) {
				break;
			}
			sum += number;
		}
		System.out.println("Sum = " + sum);
		console.close();
		
	}
}
