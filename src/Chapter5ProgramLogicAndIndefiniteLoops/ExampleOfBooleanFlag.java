package Chapter5ProgramLogicAndIndefiniteLoops;

import java.util.Scanner;

public class ExampleOfBooleanFlag {
	public static void main(String[] args) {
		cumulativeSum(5);
	}
	
	public static void cumulativeSum(int totalNumber) {
		 
		Scanner console = new Scanner(System.in);
		
		double sum = 0.0;
		boolean negative = false;
		
		for(int i = 1; i <= totalNumber; i++) {
			System.out.print("#" + i + "? ");
			double next = console.nextDouble();
			sum += next;
			
			if(sum < 0.0) {
				negative = true;
			}
		}
		System.out.println("Sum = " + sum);
		
		if(negative) {
			System.out.println("Sum went negative");
		} else {
			System.out.println("Sum never went negative");
		}
		console.close();
	}
}
