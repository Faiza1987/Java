package ConditionalExecution;

import java.util.Scanner;

public class ColorsCh4SC13 {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("What color do you want? ");
		String input = console.nextLine();
		
		if(input.equalsIgnoreCase("B")) {
			System.out.println("You have chosen Blue.");
		} else if (input.equalsIgnoreCase("G")) {
			System.out.println("You have chosen Green.");
		} else if (input.equalsIgnoreCase("R")) {
			System.out.println("You have chosen Red.");
		} else {
			System.out.println("Unknown color: " + input);
		}
		
		console.close();
	}
}
