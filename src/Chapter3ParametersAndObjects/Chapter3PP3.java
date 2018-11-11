package Chapter3ParametersAndObjects;

public class Chapter3PP3 {
	public static void main(String[] args) {
		TwelveDaysOfChristmas(12);
	}
	
	public static void TwelveDaysOfChristmas(int totalDays) {
		
		System.out.println("Day\tPresents Received\tTotal Presents\t");
			
		int totalPresents = 0;
		
		for(int days = 1; days <= 12; days++) {
			
			System.out.print(days);
			System.out.print("\t\t" + days);
			
			totalPresents += days;
			
			System.out.print("\t\t\t" + totalPresents);
			
			System.out.println();
		}
	}
}
