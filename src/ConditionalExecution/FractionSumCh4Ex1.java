package ConditionalExecution;

/* Write a method called fractionSum that accepts an integer parameter n and 
 * returns as a double the sum of the first n terms of the sequence:
 * sum i = 1 to n of 1 / i
 * You may assume that the parameter n is non-negative.
 */

public class FractionSumCh4Ex1 {
	public static void main(String[] args) {
		System.out.println(fractionSum(5));
	}
	
	public static double fractionSum(int n) {
		
		double sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += (1.0 / i);
		}
		return sum;
	}
}
