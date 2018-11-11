package Chapter4ConditionalExecution;

/* A useful technique for catching typing errors is to use a check-digit. For example, suppose
that a school assigns a six-digit number to each student. A seventh digit can be determined
from the other digits, as in:
(1 * (1st digit) + 2 * (2nd digit) + ... + 6 * (6th digit)) % 10
When someone types in a student number, they type all seven digits. If the number is typed
incorrectly, the check-digit will fail to match in 90% of the cases. Write an interactive program
that prompts for a six-digit student number and reports the check digit for that number using
the scheme described above.*/

import java.util.Scanner;

public class Chapter4PP7 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		checkDigit(console);
	}
	
	public static void checkDigit(Scanner console) {
		
		System.out.println("Please enter your 6-digit student number\n");
		System.out.print("Digit #1: ");
		int digit1 = console.nextInt();
		
		System.out.print("Digit #2: ");
		int digit2 = console.nextInt();
		
		System.out.print("Digit #3: ");
		int digit3 = console.nextInt();
		
		System.out.print("Digit #4: ");
		int digit4 = console.nextInt();
		
		System.out.print("Digit #5: ");
		int digit5 = console.nextInt();
		
		System.out.print("Digit #6: ");
		int digit6 = console.nextInt();
		
		int digit7 = (1 * (digit1) + 2 * (digit2) + 3 * (digit3) + 4 * (digit4) + 5 * (digit5) + 6 * (digit6)) % 10;
		
		System.out.print("Your student number is: " + digit1 + "" + digit2 + "" + digit3 + "" + digit4 + "" + digit5 + "" + digit6 + "" + digit7);
	}
}
