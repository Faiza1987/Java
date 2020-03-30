import java.util.Scanner;

public class Credit {
	public static void main(String[] args) {
		validCreditCard();
	}
	
	public static void validCreditCard() {
		Scanner input = new Scanner(System.in);
		boolean valid;
		String strNumber;
		Long creditcardNumber;
		int product = 0;
		int sum = 0;
		int finalSum = 0;
		int length = 0;
		
		do {
			System.out.println("Please enter a credit card number between 13 to 16 digits long: ");
			creditcardNumber = input.nextLong();
			System.out.println(creditcardNumber);
			System.out.println(creditcardNumber.getClass());
			
//			strNumber = Long.toString(creditcardNumber);
//			System.out.println(strNumber);
//			System.out.println(strNumber.getClass());
			
			while(creditcardNumber != 0) {
				creditcardNumber /= 10;
				length++;
			}
			
			if(length < 13 || length > 16) {
				valid = false;
				System.out.println("Invalid entry! Please enter a credit card number: ");
				input.next();
			} else {
				valid = true;
			}
		} while(!valid);
		
		
		for(int i = length - 1; i >= 0; i -= 2) {
			product *= 
			sum += product;
		}
			
		input.close();
	}
}
