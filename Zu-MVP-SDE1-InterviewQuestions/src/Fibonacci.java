
public class Fibonacci {

	// print the first 47 numbers of the Fibonacci Sequence
	
	public static void main(String[] args) {
		long temp = 0;
		long n1 = 0;
		long n2 = 1;
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i = 1; i <= 47; i++) {
			System.out.println(i + ": " + (n1 + n2));
			
			temp = n2;
			n2 += n1;
			n1 = temp;
		}
		
//		for(int i = 0; i <= 8 ; i++) {
//			System.out.println(fibonacci(i));
//		}
		
	}
	
	// Recursion
//	public static long fibonacci(long n) {
//		if(n == 0) {
//			return 0;
//		}
//		if(n <= 2) {
//			return 1;
//		}
//		return fibonacci(n-1) + fibonacci(n-2);
//	}
	
//	public static int factorial(int n) {
//		if(n <= 1){
//			return 1;
//		}
//		return n * factorial(n-1);
//	}
}
