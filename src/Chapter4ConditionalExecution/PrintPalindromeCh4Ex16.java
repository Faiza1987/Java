package Chapter4ConditionalExecution;

import java.util.Arrays;
import java.util.Scanner;

/* Write a method called printPalindrome that accepts a Scanner for the console as a parameter, and prompts the user to enter one or more words and prints whether the entered String is a palindrome (i.e., reads the same forwards as it does backwards, like "abba" or "racecar"). If the following Scanner object were declared:


Scanner console = new Scanner(System.in);
printPalindrome(console);
The resulting output for a call where the user types a palindrome would be:

Type one or more words: racecar
racecar is a palindrome!
The output for a call where the user types a word that is not a palindrome would be:

Type one or more words: hello
hello is not a palindrome. */

public class PrintPalindromeCh4Ex16 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		printPalindrome(console);
		console.close();
	}
	
	public static void printPalindrome(Scanner console) {
		
		System.out.print("Type one or more words: ");
		String wordO = console.nextLine();
		String word = wordO.toLowerCase();
		
		//loop through word from index 0 until word.length - 1; 
		//loop through word from index word.length() - 1 until 0
		//if the char at index i == char at index j
		//then print "Palindrome!"
		//else print "Not a palindrome"
		
		boolean palindrome = true;
		
		for(int i = 0; i <= (word.length())/2; i++) {
			palindrome = true;
			if(word.charAt(i) == word.charAt(word.length()-1-i)) {
				palindrome = true;
			}
			else {
				palindrome = false;
				
				break;
			}			
		}
		if(palindrome) {
			System.out.println(wordO + " is a palindrome!");
		} else {
			System.out.println(wordO + " is not a palindrome.");
		}
		console.close();
	}

}

//for(int j = (word.length() - 1)/2; j >= 0; j--) {
//	System.out.println(word.charAt(i) + " " + word.charAt(j));
//	if(word.charAt(i) == word.charAt(j)) {
//		palindrome = true;
//		
//	} else {
//		palindrome = false;
//	}
//}
