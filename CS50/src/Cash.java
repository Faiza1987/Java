import java.util.Scanner;

// change owed
public class Cash {
	public static void main(String[] args) {
		changeOwed();
	}
	
	public static void changeOwed() {
		Scanner input = new Scanner(System.in);
		int coins = 0;
		boolean valid;
		double change = 0;
		double changeInCents = 0.0;
		System.out.println(changeInCents);
		
		do {
			System.out.println("How much change is owed? ");
			if (input.hasNextDouble()) {
				change = input.nextDouble();
				
				if(change < 0) {
					valid = false;
					input.next();
				} else {					
					changeInCents = (change * 100) + 0.001;
					valid = true;
				}
			} else {
				System.out.println("Invalid input. Please enter again: ");
				valid = false;
				input.next();
			}
		} while (!valid);
		
		input.close();
		
		while(changeInCents >= 25) {
			changeInCents -= 25;
			coins++;
		} 
		while(changeInCents >= 10 && changeInCents < 25) {
			changeInCents -= 10;
			coins++;
		} 
		while(changeInCents >= 5 && changeInCents < 10) {
			changeInCents -= 5;
			coins++;
		} 
		while(changeInCents >= 1 && changeInCents < 5){
			changeInCents -= 1;
			coins++;
		} 
		System.out.println("You are owed " + coins + " coins.\n");
		
	}
}
