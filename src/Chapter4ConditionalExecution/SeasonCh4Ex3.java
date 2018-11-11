package Chapter4ConditionalExecution;
/*
 * Write a method named season that takes two integers as parameters representing a month and day and that returns a String indicating the season for that month and day. Assume that months are specified as an integer between 1 and 12 (1 for January, 2 for February, and so on) and that the day of the month is a number between 1 and 31.

If the date falls between 12/16 and 3/15, you should return "Winter". If the date falls between 3/16 and 6/15, you should return "Spring". If the date falls between 6/16 and 9/15, you should return "Summer". And if the date falls between 9/16 and 12/15, you should return "Fall".
 */
public class SeasonCh4Ex3 {
	public static void main(String[] args) {
		System.out.println(seasons(9, 16));
	}
	
	public static String seasons(int month, int day) {
		
		if((month == 3) && (day >= 16) || (month == 4) || (month == 5) || (month == 6) && (day <= 15)) {
			System.out.println("Spring");
			
		} else if (((month == 6) && (day >= 16)) || (month == 7) || (month == 8) || (month == 9) && (day <= 15)) {
			System.out.println("Summer");
			
		} else if (((month == 9) && (day >= 16)) || (month == 10) || (month == 11) || (month == 12) && (day <= 15)) {
			System.out.println("Autumn");
		
		} else {
			System.out.println("Winter");
		}
		
		//BETTER SOULTION
		
		double dVal = month + (day / 30.0);
		System.out.println(dVal);
		
		if(dVal > 3.5 && dVal <= 6.5) {
		return "Spring";
		
		} else if(dVal > 6.5 && dVal <= 9.5) {
			return "Summer"; 
		
		} else if(dVal > 9.5 && dVal <= 12.5) {
			return "Autumn";
		
		} else {			
			return "Winter";
		}
	}
}
