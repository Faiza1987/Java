package easyProblems;

import java.util.Arrays;

/*Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Follow up: Could you solve it without converting the integer to a string?

 

Example 1:
Input: x = 121
Output: true

Example 2:
Input: x = -121
Output: false

Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Example 4:
Input: x = -101
Output: false
 

Constraints:
-231 <= x <= 231 - 1*/

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(palindromeNumber(121)); // true
		System.out.println(palindromeNumber(-121)); // false
		System.out.println(palindromeNumber(10)); // false
		System.out.println(palindromeNumber(-101)); // false
		System.out.println(palindromeNumber(0)); // true
	}
	
	public static boolean palindromeNumber(int x) {
		if(x < 0) {
			return false;
		}
		
		if(x < 10) {
			return true;
		}
		int copy = x;
		int reversedInt = 0;
		
		while(x > 0) {
			reversedInt *= 10;
			reversedInt += x % 10;	
			
			if(reversedInt == copy) {
				return true;
			}
			
			x /= 10;
		
		}
		return false;
	}
}
