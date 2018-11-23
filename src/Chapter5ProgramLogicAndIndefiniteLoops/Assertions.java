package Chapter5ProgramLogicAndIndefiniteLoops;

import java.util.Scanner;

public class Assertions {
	public static void main(String[] args) {
		//assertionExampla();
		printCommonPrefix(32845, 328929343);
	}
	
	public static void assertionExample() {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Please give me a non-negative number --> ");
		double number = console.nextDouble();
		while(number < 0.0) {
			System.out.print("That was a negative number. Try again --> ");
			number = console.nextDouble();
		}
		console.close();
	}
	
	
	/*This method finds the longest sequence of leading digits th/at two numbers have in common. For
example, the numbers 32845 and 328929343 each begin with the prefix 328. This method will
compute that prefix and will also report the total number of digits that are discarded by the
computation.*/
	
	public static void printCommonPrefix(int x, int y) {
		int z = 0;
		//Point A
		while(x != y) {
			//Point B
			z++;
			//Point C
			if(x > y) {
				//Point D
				x = x / 10;
			} else {
				//Point E
				y = y / 10;
			}
			//Point F
		}
		//Point G
		System.out.println("Common prefix = " + x);
		System.out.println("Digits discarded = " + z);
		
//						x > y					x == y						z == 0
//		Point A		sometimes true/false 	sometimes true/false  		always true
//		Point B		sometimes true/false 	never true					sometimes true/false
//		Point C		sometimes true/false 	never true					never true
//		Point D		always true				never true					never true
//		Point E		never true				never true					never true
//		Point F		sometimes true/false 	sometimes true/false 		never true
//		Point G		never true				always true					sometimes true/false 
	}
	
}
