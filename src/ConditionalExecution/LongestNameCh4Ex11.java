package ConditionalExecution;

/* Write a static method named longestName that reads names typed by the user and prints the longest name (the name that contains the most characters) in the format shown below. Your method should accept a console Scanner and an integer n as parameters and should then prompt for n names.

The longest name should be printed with its first letter capitalized and all subsequent letters in lowercase, regardless of the capitalization the user used when typing in the name. If there is a tie for longest between two or more names, use the tied name that was typed earliest. Also print a message saying that there was a tie, as in the right log below. It's possible that some shorter names will tie in length, such as DANE and Erik in the left log below; but don't print a message unless the tie is between the longest names. You may assume that n is at least 1, that each name is at least 1 character long, and that the user will type single-word names consisting of only letters. */

import java.util.Scanner;

public class LongestNameCh4Ex11 {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		longestName(console, 7);
		
		console.close();
	}
	

	public static void longestName(Scanner console, int n) {
		
		String longest = "";
		boolean tie = true;
		
		for(int i = 1; i <= n; i++) {
			
			System.out.print("name #" + i + "? ");
			String name = console.next().toLowerCase();
			
			if(name.length() > longest.length()) {
				tie = false;
				longest = name;
				
				
				
			} else if(name.length() == longest.length()) {
				tie = true;				
				//longest = name;		
			} 
		}
		
		String properName = longest.substring(0, 1).toUpperCase() + longest.substring(1);
		
		System.out.println(properName + "'s name is longest");

		if(tie == true) {					
			System.out.println("(There was a tie!)");
		}
	}
}
