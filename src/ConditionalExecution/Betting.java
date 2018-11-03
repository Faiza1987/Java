package ConditionalExecution;

import java.util.Scanner;

public class Betting {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("How much money do you have? ");
		int money = console.nextInt();

		console.close();
		
		System.out.println("You have $" + money + " left.");
		if(money < 500) {
			System.out.println("Your cash is dangerously low. Bet carefully.");
			
		} else if(money < 1000) {
			System.out.println("Your cash is somewhat low. Bet moderately");
			
		} else {
			System.out.println("Your cash is in good shape. Bet liberally.");
		}
		System.out.println("How much do you want to bet?");
		int bet = console.nextInt();
		
	}
}
