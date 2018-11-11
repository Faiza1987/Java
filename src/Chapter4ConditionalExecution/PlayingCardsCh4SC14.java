package Chapter4ConditionalExecution;

import java.util.Scanner;

public class PlayingCardsCh4SC14 {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a card: ");
		String input = console.nextLine().toUpperCase();
		
		String[] strArr = input.split(" ");
		
		String value = strArr[0];
		String suit = strArr[1];
		
		switch(value) {
			case "A": value = "Ace"; break;
			case "2": value = "Two"; break;
			case "3": value = "Three"; break;
			case "4": value = "Four"; break;
			case "5": value = "Five"; break;
			case "6": value = "Six"; break;
			case "7": value = "Seven"; break;
			case "8": value = "Eight"; break;
			case "9": value = "Nine"; break;
			case "10": value = "Ten"; break;
			case "J": value = "Jack"; break;
			case "Q": value = "Queen"; break;
			case "K": value = "King"; break;
		}
		
		switch(suit) {
			case "C": suit = "Clubs"; break;
			case "D": suit = "Diamonds"; break;
			case "H": suit = "Hearts"; break;
			case "S": suit = "Spades"; break;
		}
		
		System.out.println(value + " of " + suit);
		
		console.close();
	}
}
