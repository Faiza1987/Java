package EasyProblems;

import java.math.BigInteger;

/*Given a 32-bit signed integer, reverse digits of an integer.

Note:
Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

 

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21

Example 4:
Input: x = 0
Output: 0
 

Constraints:
-231 <= x <= 231 - 1
*/

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverseInteger(83648));
		System.out.println(reverseInteger(-3648));
		System.out.println(reverseInteger(21474));
		System.out.println(reverseInteger(-2147483648));
	}

	public static int reverseInteger(int number) {
		if(number < Integer.MIN_VALUE) {
			return 0;
		}
		int copy = number;
		long reversedInt = 0;
		
		while(number != 0) {
			reversedInt *= 10;
			reversedInt += number % 10;
			
			if(reversedInt > Integer.MAX_VALUE || reversedInt < Integer.MIN_VALUE) {
				return 0;
			}			
			number /= 10;
		}
		return (int)reversedInt;
	}
	
	public static int reverseIntegerString(int integer) {
		System.out.println("MAX: " + Integer.MAX_VALUE);
		System.out.println("MIN: " + Integer.MIN_VALUE);
		
		if(integer <= Integer.MIN_VALUE) {
			return 0;
		}
		
		int copy = integer;
		int count = 0;
		
		do {
			copy /= 10;
			count++;
		} while( copy != 0);
		
		String reversedInt = "";
		if(integer < 0) {
			reversedInt = "-";
			integer *= -1;
		}
		
		for(int i = 0; i < count; i++) {	
			reversedInt += integer % 10;
			System.out.println("Reversed Int: " + reversedInt);
			
			integer /= 10;
		}	
		
		if(Long.parseLong(reversedInt) >= Integer.MAX_VALUE) {
			return 0;
		}	
        if(Long.parseLong(reversedInt)<= Integer.MIN_VALUE) {
			return 0;
		}
		return Integer.parseInt(reversedInt);
	}
}
