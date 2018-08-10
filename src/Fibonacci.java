
public class Fibonacci {
	public static void main(String[] args) {
		
		// 1 + 1 = 2
		// 1 + 2 = 3
		//2 + 3 = 5 and so on
		// each iteration of Fibonacci is a pair and produces 2 numbers
		
		int n1 = 1; // the 1st element
		int n2 = 1; // the 2nd element
		
		for(int i = 1; i <= 6; i++) {
			System.out.print(n1 + " ");
			System.out.print(n2 + " ");
			
			n1 += n2; //stores the sum of the two newest elements as n1
			n2 += n1; //stores the sum of the new n1 and old n2 as a new n2 
		}
	}
}
