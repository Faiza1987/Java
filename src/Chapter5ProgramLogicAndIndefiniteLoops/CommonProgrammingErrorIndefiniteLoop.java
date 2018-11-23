package Chapter5ProgramLogicAndIndefiniteLoops;

import java.util.Scanner;

public class CommonProgrammingErrorIndefiniteLoop {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Type a number: ");
		int number = console.nextInt();
		
		//This code does not compile because it is infinite
// 		while(number > 0) {
//			System.out.println(number / 2);
//		}
 		
 		//This code behaves correctly
 		while(number > 0) {
 			number = number / 2; //update step: divide in half and store
 			System.out.println(number);
 		}
		console.close();
	}
}
