package Chapter5ProgramLogicAndIndefiniteLoops;

import java.util.Scanner;

public class Misc {
	public static void main(String[] args) {
		
//		//While loop example
//		int number = 7300;
//		while (number <= 200) {
//			number *= 2;
//		}
//		System.out.println(number);
//	
//		//While loop to find the smallest divisor
//		int divisor = 2;
//		while(number % divisor != 0) {
//			divisor++;
//		} 
//		
//		System.out.println("a.");
//		int max = 5;
//		int n = 1;
//		while (n <= max) {
//			System.out.println(n);
//			n++;
//		}
//		System.out.println();
//		
//		System.out.println("b.");
//		int total = 25;
//		int number = 1;
//
//		while(number <= (total / 2)) {
//			total = total - number;
//			System.out.println(total + " " + number);
//			number++;
//		}
//		System.out.println();
//		
// ****!****!****!
// ****!****!****!	
//		System.out.println("c.");
//		int j = 1;
//		
//		while(j <= 2) {
//			int i = 1;
//			while (i <= 3) {
//				int stars = 1;
//				
//				while (stars <= 4) {
//					System.out.print("*");
//					stars++;
//				}
//				System.out.print("!");
//				i++;
//			}
//			System.out.println();
//			j++;
//		}
//		System.out.println();
//		
//		System.out.println("d.");
//		number = 4;
//		
//		int count = 1;
//		while (count <= number) {
//			System.out.println(number);
//			number = number / 2;
//			count++;
//		}
		
		//Do-While Loop
//		int number = 1;
//		do {
//			number *= 2;
//			System.out.println(number);
//		} while (number <= 200);

		Scanner console = new Scanner(System.in);
		System.out.print("Type something for me! ");
		if(console.hasNextInt()) {
			int number = console.nextInt();
			System.out.println("Your IQ is " + number);
		} else if(console.hasNext()) {
			String token = console.next();
			System.out.println("Your name is " + token);
		}
		console.close();
	}
}
