package Chapter5ProgramLogicAndIndefiniteLoops;

import java.util.*;

public class Pick {
	public static void main(String[] args) {
		System.out.println("This program picks random numbers from 1 to 100\n"
				+ "until a particular number comes up.\n");
		
		Scanner console = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("Pick a number between 1 and 100 --> ");
		int number = console.nextInt();
		
		int result = -1;
		int count = 0;
		
		while(result != number) {
			result = r.nextInt(100) + 1; //random numbers from 1-100
			System.out.println("Next number = " + result);
			count++;
		}
		System.out.println("Your number came up after " + count + " times");
		console.close();
	}
}
