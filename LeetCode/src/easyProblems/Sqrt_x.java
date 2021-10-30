package easyProblems;

/*
 * Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.


Example 1:
Input: x = 4
Output: 2

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 

Constraints:
0 <= x <= 231 - 1*/
public class Sqrt_x {

	public static void main(String[] args) {
		System.out.println("SQRT: " + sqrt(16));
	}
	
	public static int sqrt(int x) {
		
		if(x <= 1) {
			return x;
		}
		
		int s = 0;
		int e = x;

		while(s <= e) {
			int m = (s + e) / 2;
			
			System.out.print("M: " + m + "\t| ");
			System.out.print("S: " + s + " ");
			System.out.print("E: " + e + "\t| ");
			System.out.print("x/m: " + x/m + " | ");
			
			if(m > (x/m)) {
				e = m - 1;
			} else if(m < (x/m)) {
				s = m + 1;	
			} else {
				return m;
			}
			System.out.print("S: " + s + " ");
			System.out.println("E: " + e);
		}
		return s - 1;	
	}
	
//	public static int sqrt(int x) {
//		if(x < 0) {
//			return 0;
//		}
//		if(x == 1) {
//			return 1;
//		}
//		
//		long d = x / 2;
//		
//		while(x / d <= d) {
//			System.out.println("D: " + d);
//			if(d * d <= x) {
//				return (int) d;
//			} 
//			d--;
//		}
//		return (int) d;
//	}
}
