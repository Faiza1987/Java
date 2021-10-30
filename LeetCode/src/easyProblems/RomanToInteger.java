package easyProblems;

/*Share
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

Example 1:
Input: s = "III"
Output: 3

Example 2:
Input: s = "IV"
Output: 4

Example 3:
Input: s = "IX"
Output: 9

Example 4:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 5:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 
Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].*/

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInteger("I")); 
		System.out.println(romanToInteger("IV"));
		System.out.println(romanToInteger("V"));
		System.out.println(romanToInteger("VI"));
		System.out.println(romanToInteger("VII"));
		System.out.println(romanToInteger("VIII"));
		System.out.println(romanToInteger("IX"));   // 9
		System.out.println(romanToInteger("XXIX")); // 29
		System.out.println(romanToInteger("XL"));   // 40
		System.out.println(romanToInteger("XVI"));  // 16
		System.out.println(romanToInteger("XVI"));  // 16
		System.out.println(romanToInteger("XCIX"));  // 99
		System.out.println(romanToInteger("CM"));  // 900

	}
	
	public static int romanToInteger(String str) {
		int number = 0;
		
		for(int i = 0; i < str.length(); i++) {			
			if(str.charAt(i) == 'I') {
				number += 1;
			}
			if(str.charAt(i) == 'V') {
				number += 5;

				if(i > 0) {					
					if(str.charAt(i - 1) == 'I') {
						number -= 2;
					}
				}
			}
			
			if(str.charAt(i) == 'X') {
				number += 10;
				
				// subtraction
				if(i > 0) {					
					if(str.charAt(i - 1) == 'I') {
						number -= 2;
					}
				}
			}
			if(str.charAt(i) == 'L') {
				number += 50;
				
				if(i > 0) {					
					if(str.charAt(i - 1) == 'X') {
						number -= 20;
					}
				}
			}
			
			if(str.charAt(i) == 'C') {
				number += 100;
				
				if(i > 0) {
					if(str.charAt(i - 1) == 'X') {
						number -= 20;
					}
				}
			}
			
			if(str.charAt(i) == 'D') {
				number += 500;
				
				if(i > 0) {					
					if(str.charAt(i - 1) == 'C') {
						number -= 200;
					}
				}
			}
			
			if(str.charAt(i) == 'M') {
				number += 1000;
				
				if(i > 0) {
					if(str.charAt(i - 1) == 'C') {
						number -= 200;
					}
				}
			}
		}
		return number;
	}
}
