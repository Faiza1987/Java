package ConditionalExecution;
/* A "perfect number" is a positive integer that is the sum of all its proper factors (that is, factors including 1 but not the number itself). The first two perfect numbers are 6 and 28, since 1+2+3=6 and 1+2+4+7+14=28. Write a static method perfectNumbers that takes an integer max as an argument and prints out all perfect numbers that are less than or equal to max.

Here is the console output from a call to perfectNumbers(6):

Perfect numbers up to 6: 6 
Here is the console output from a call to perfectNumbers(500):

Perfect numbers up to 500: 6 28 496 */

public class PerfectNumbersCh4Ex21 {

	public static void main(String[] args) {
		//System.out.println(isPrime(11));
		perfectNumbers(35000000);
		
	}
	
	public static boolean isPrime(int num) {
		
		if(num == 1) {
			return false;
		}
		
		/*To avoid redundancy in iterations use Math.sqrt(num) because if a number is not divisible by any number <= it's sqrt, then it will not be divisible by any number greater than it's sqrt. */
		
		for(int i = 2; i < (long)(Math.sqrt(num)); i++) {
			
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void perfectNumbers(int max) {
		int n = 1;		
		System.out.print("Perfect numbers up to " + max + ": " );
		
		while(Math.pow(2, n - 1) * (Math.pow(2, n) - 1) <= max) {
			
			if(isPrime(n) && isPrime((int)(Math.pow(2, n) - 1))) {
				
				System.out.print((int)(Math.pow(2, n - 1) * (Math.pow(2, n) - 1)) + " ");
			}
			n++;
		}
	}
}
