package Chapter5ProgramLogicAndIndefiniteLoops;

/* Write code that prompts for three integers, averages them, and prints the average. Make your code robust against invalid input; if the user types a non-number, re-prompt with the same prompt message. (You may want to look at the getInt method discussed in Chapter 5. You can call that method in your solution if you like.) Here is an example dialogue:

Type an integer: 5
Type an integer: 2
Type an integer: 17
Average: 8.0 */

import java.util.*;

public class ScannerAverage3SC26 {
	public static void main(String[] args) {
		scannerAverage3();
	}
	
	public static void scannerAverage3() {
		Scanner console = new Scanner(System.in);
		
		String prompt = "Type an integer: ";
		
		double x = getInt(console, prompt);
		double y = getInt(console, prompt);
		double z = getInt(console, prompt);
		
		double average = (x + y + z) / 3;
		System.out.println("Average = " + average);
	}
	public static int getInt(Scanner console, String prompt) {
		System.out.print(prompt);
		while(!console.hasNextInt()) {
			console.next(); //to discard input
			System.out.println("That is not an integer. Please try again.");
			System.out.print(prompt);
		}
		return console.nextInt();
	}
	
}
