package Chapter3ParametersAndObjects;

import java.util.Scanner;

public class ProcessName {
	public static void main(String[] args) {
		
		Scanner tom = new Scanner(System.in);
		
		processName(tom);
	}
	
	public static void processName(Scanner input) {
		System.out.print("Please enter your full name: ");
		String firstName = input.next();
		String lastName = input.next();
		
		System.out.println("Your name in reverse order is " + lastName + ", " + firstName);
		
		input.close();
	}
}
