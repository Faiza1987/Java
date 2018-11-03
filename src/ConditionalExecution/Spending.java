package ConditionalExecution;

import java.util.Scanner;

public class Spending {
	public static void main(String[] args) {
		
		Scanner cup = new Scanner(System.in);

		spending(cup, "John");
		spending(cup, "Jane");
		
		cup.close();
	}
	
	//Scanner input takes the value of Scanner cup
	
	public static void spending(Scanner input, String name) {
		
		System.out.print("How much will " + name + " be spending? ");
		
		double amount = input.nextDouble();
		
		int numBills = (int) (amount / 20.0);
	
		if(numBills * 20.0 < amount) {
			numBills++;
		}
		
		System.out.println(name + " needs " + numBills + " bills");
		
	}
}
