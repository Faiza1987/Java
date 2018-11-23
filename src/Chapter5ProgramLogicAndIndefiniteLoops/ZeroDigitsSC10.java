package Chapter5ProgramLogicAndIndefiniteLoops;

/* Write a method called zeroDigits that accepts an integer parameter and returns the number of digits in the number that have the value 0. For example, the call zeroDigits(5024036) should return 2, and zeroDigits(743) should return 0. The call zeroDigits(0) should return 1. You may assume that the integer is non-negative. (We suggest you use a do/while loop in your solution.)
 */

public class ZeroDigitsSC10 {
	public static void main(String[] args) {
		System.out.println(zeroDigits(743));
	}
	
	public static int zeroDigits(int x) {
		
		int counter = 0;
		int y = 0;
		
		do {
			y = x % 10;
			
			if(y == 0) {
				counter++;
			}
			
			x /= 10;
			
		} while(x > 0);
		return counter;
	}
}
