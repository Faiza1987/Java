package Chapter3ParametersAndObjects;

public class Chapter3PP2 {
	public static void main(String[] args) {
		accumulateInterest(1000.00, 2018, 2042);
	}
	
	public static void accumulateInterest(double balance, int startYear, int endYear) {
		
		System.out.println("Year\tStarting Balance\tIntereset\tNew Deposit\tClosing Balance");
		
		double interestRate = 6.5 / 100;
		double interest = 0;
		double newDeposit = 100.00;

		
		for(int i = startYear; i <= endYear; i++) {
			System.out.print(startYear);
			System.out.printf ("\t%.2f", balance);
			
			interest = balance * interestRate;
			System.out.printf ("\t\t\t%.2f", interest);
			
			System.out.printf("\t\t%.2f", newDeposit);
			
			balance += (interest + 100);
			System.out.printf ("\t\t%.2f", balance);
			
			System.out.println();
			startYear++;
		}
	}
}
