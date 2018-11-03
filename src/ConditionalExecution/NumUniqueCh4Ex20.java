package ConditionalExecution;

/* Write a method named numUnique that takes three integers as parameters and that returns the number of unique integers among the three. For example, the call numUnique(18, 3, 4) should return 3 because the parameters have 3 different values. By contrast, the call numUnique(6, 7, 6) would return 2 because there are only 2 unique numbers among the three parameters: 6 and 7. */


public class NumUniqueCh4Ex20 {
	public static void main(String[] args) {
		System.out.println(numUnique(7, 7, 7));
	}
	
	public static int numUnique(int num1, int num2, int num3) {
		
		// All of the numbers are the same
		if(num1 == num2 && num1 == num3 && num2 == num3) {
			return 1;
			
		// 2 of the numbers are the same
		} else if (num1 == num2 || num1 == num3 || num2 == num3) {
			return 2;
			
		//All numbers are different
		} else {
			return 3;
		}
	}
}
