package Chapter4ConditionalExecution;

public class Factorial {
	public static void main(String[] args) {
		
//		for(int i = 0; i <= 10; i++) {
//			System.out.println(i + "! = " + factorial(i));
//		}
		
		System.out.println(factorial(-1));
	}
	
	//pre-condition: n >= 0
	//post-condition: returns n factorial(n!)
	public static int factorial(int n) {
		//Trhow exception for negative numbers
		if(n < 0) {
			throw new IllegalArgumentException("Negative value in factorial");
		}
		//Factorial
		int product = 1;
		for(int i = 2; i <= n; i++) {
			product *= i;
		}
		return product;
	}
}
