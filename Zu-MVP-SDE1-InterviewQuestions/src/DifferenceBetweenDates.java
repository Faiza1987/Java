
public class DifferenceBetweenDates {

	/*
	 * Write a function which accepts two dates and returns the difference between the 
dates as number of months and numbers of days. For example, The difference 
between 5/28/1981 and 12/25/2000 is 234 months, 27 days excluding the end date.

*/
	public static void main(String[] args) {
		System.out.println(isLeapYear(2100)); // false
		System.out.println(isLeapYear(2104)); // true
		System.out.println(isLeapYear(2000)); // true
		System.out.println(isLeapYear(2006)); // false
		System.out.println(isLeapYear(2020)); // true
		System.out.println(isLeapYear(2024)); // true
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(1700));

	}
	
	public static boolean isLeapYear(int year) {
		// evenly divisible by 4
			// NOT evenly divisible by 100
				// evenly divisible by 400 
		
		
		boolean isLeapYear = false;
		
		if(year % 4 == 0){
			isLeapYear = true;
		}
		if(year % 100 == 0) {
			isLeapYear = false;
		}
		if(year % 400 == 0) {
			isLeapYear = true;
		}
		
		return isLeapYear;
	}
	
	public static boolean isLeapYearNested(int year) {
		// evenly divisible by 4
			// NOT evenly divisible by 100
				// evenly divisible by 400 
		
		if(year % 4 == 0) {
			
		} 
		return false;
	}
	
}
