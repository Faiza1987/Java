package Chapter4ConditionalExecution;

/*Exercise 5: Write a method named pow that accepts a base and an exponent as parameters and returns the base raised to the given power. For example, the call pow(3, 4) returns 3 * 3 * 3 * 3 or 81. Do not use Math.pow in your solution. Assume that the base and exponent are non-negative.
 
 * Exercise 14: Write a method named pow2 (a variation of the previous pow exercise) that accepts a real number base and an integer exponent as parameters and returns the base raised to the given power. Your code should work for both positive and negative exponents. For example, the call pow2(2.0, -2) returns 0.25. Do not use Math.pow in your solution. */

public class POWCh4Ex5and14 {
	public static void main(String[] args) {
		System.out.println(pow(2.0, -2));
	}
	
	public static double pow(double base, int exp) {
		
		double raisedBase = 1;

		if(exp < 0) { //if exponent is negative
			exp *= -1;  //multiply by -1 to turn it positive
			
			for(int i = 1; i <= exp; i++) {
				raisedBase *= base;
			}
			raisedBase = 1 / raisedBase;
			
		} else {
			
			for(int i = 1; i <= exp; i++) {
				raisedBase *= base;
			}
		}		
		return raisedBase;
	}
}
