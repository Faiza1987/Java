package ParametersAndObjects;
public class PrintSquare {
	public static void main(String[] args) {
		printSquares(5, 5);
	}
	
	public static void printSquares(int min, int max) {	
		//First Triangle
		int newMin = min;
		for(int line = newMin; line <= max; line++) {
			for(int i = newMin; i <= max; i++) {
				System.out.print(i);
			}
			
			for(int num = min; num <= line - 1; num++) {
				System.out.print(num);
			}
			
			newMin++;
			System.out.println();
		}
		System.out.println("min: " + min);
	}
}
