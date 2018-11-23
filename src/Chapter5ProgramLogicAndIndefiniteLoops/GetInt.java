package Chapter5ProgramLogicAndIndefiniteLoops;

import java.util.Scanner;

public class GetInt {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int age = getInt(console, "How old are you in years? ");
		console.close();

	}
	
	public static int getInt(Scanner console, String prompt) {
		
		System.out.print(prompt + " ");
		while(!(console.hasNextInt())) {
			console.next(); //to discard the input
			System.out.println("That is not an integer. Please try again.");
			System.out.print(prompt + " ");
		}
		return console.nextInt();
	}
}
