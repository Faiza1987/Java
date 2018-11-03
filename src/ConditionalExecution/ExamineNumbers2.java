package ConditionalExecution;

//Finds the average of a sequence of numbers as well as reporting 
//how many of the numbers were negative

import java.util.*;

public class ExamineNumbers2 {
	public static void main(String[] args) {
		System.out.println("This program examines a sequence of numbers to\n"
				+ "find the average as well as well as counting how many\n"
				+ "are negative.\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers do you want to examine? ");
		int totalNumber = input.nextInt();
		
		int negatives = 0;
		double sum = 0.0;
		
		for(int i = 1; i <= totalNumber; i++) {
			System.out.print("#" + i + "? ");
			double next = input.nextDouble();
			sum += next;
			
			if(next < 0) {
				negatives++;
			}
		}
		System.out.println();
		
		if (totalNumber <= 0) {
			System.out.println("No numbers to average.");
		} else {
			System.out.println("Average: " + sum / totalNumber);
		}
		System.out.println("# of negatives: " + negatives);
		
		input.close();
	}
}
