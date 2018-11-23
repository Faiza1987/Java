package Chapter5ProgramLogicAndIndefiniteLoops;

import java.util.*;

public class Pick2 {
	public static void main(String[] args) {
		
		System.out.println("This program picks random numbers from 1 to 10\n"
				+ "until a particular number comes up.\n");
		
		Scanner console = new Scanner(System.in);
		Random r = new Random(); 
		
		System.out.print("Pick a number between 1 and 10 --> ");
		int number = console.nextInt();
		
		int result;
		int count = 0;
		
		do {
			result = r.nextInt(10) + 1;
			System.out.println("Next number = " + result);
			count++;
		} while (result != number);
		System.out.println("Your number came up after " + count + " times.");
		console.close();
	}
}
