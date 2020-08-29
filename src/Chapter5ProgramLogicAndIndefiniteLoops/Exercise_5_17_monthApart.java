package Chapter5ProgramLogicAndIndefiniteLoops;

//Write a method named monthApart that accepts four integer parameters representing two calendar dates. Each date consists of a month (1 through 12) and a day (1 through the number of days in that month [28-31]). The method returns whether the dates are at least a month apart. Assume that all dates in this problem occur during the same year. For example, the following dates are all considered to be at least a month apart from 9/19 (September 19): 2/14, 7/25, 8/2, 8/19, 10/19, 10/20, and 11/5. The following dates are NOT at least a month apart from 9/19: 9/20, 9/28, 10/1, 10/15, and 10/18. Note that the first date could come before or after (or be the same as) the second date. Assume that all parameter values passed are valid.

//Sample calls:
//monthApart( 6, 14, 9, 21)		true	June 14th is at least a month before September 21st
//monthApart( 4, 5, 5, 15)		true	April 5th is at least a month before May 15th
//monthApart( 4, 15, 5, 15)		true	April 15th is at least a month before May 15th
//monthApart( 4, 16, 5, 15)		false	April 16th is NOT at least a month before May 15th
//monthApart( 6, 14, 6, 8)		false	June 14th is NOT at least a month apart from June 8th
//monthApart( 7, 7, 6, 8)		false	July 7th is NOT at least a month apart from June 8th
//monthApart( 7, 8, 6, 8)		true	July 8th is at least a month after June 8th
//monthApart( 10, 14, 7, 15)	true	October 14th is at least a month after July 15th


public class Exercise_5_17_monthApart {

	public static void main(String[] args) {
		System.out.println(monthApart( 6, 14, 9, 21)); // true
		System.out.println(monthApart( 4, 5, 5, 15)); // true
		System.out.println(monthApart( 4, 15, 5, 15)); // true
		System.out.println(monthApart( 4, 16, 5, 15)); // false
		System.out.println(monthApart( 6, 14, 6, 8)); // false
		System.out.println(monthApart( 7, 7, 6, 8)); // false
		System.out.println(monthApart( 7, 8, 6, 8)); // true
		System.out.println(monthApart( 10, 14, 7, 15)); // true
	}

	public static boolean monthApart(int month1, int day1, int month2, int day2) {
		
		if(month1 - month2 > 1) {
			return true;
		}
		
		if(month1 < month2) {
			if(day1 <= day2) {
				return true;
			}
		}
		
		if(month1 > month2) {
			if(day1 >= day2) {
				return true;
			}
		}	
		return false;
	}
}
