package ParametersAndObjects;

import java.util.Scanner;

public class InputBirthday {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		inputBirthday(input);
	}
	
	public static void inputBirthday(Scanner input) {
		
		System.out.print("On what day of the month were you born? ");
		int day = input.nextInt();
		
		input.nextLine(); 
		
		System.out.print("What is the name of the month in which you were born? ");
		String month = input.nextLine();
		
		System.out.print("During what year were you born? ");
		int year = input.nextInt();
		
		System.out.println("You were born on " + month + " " + day + ", " + year + ". You're mighty old!");
		
		input.close();
	}
}
