package ParametersAndObjects;

import java.util.Scanner;

public class Chapter3PP4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length for side a: ");
		double a = input.nextDouble();
		
		System.out.print("Enter length for side b: ");
		double b = input.nextDouble();
		
		System.out.print("Enter length for side c: ");
		double c = input.nextDouble();
		
		input.close(); 
		
		angleCalc(a, b, c);
	}
	
	public static void angleCalc(double a, double b, double c) {

		double rA = ((b * b) + (c * c) - (a * a)) / (2 * b * c);
		double rB = ((a * a) + (c * c) - (b * b)) / (2 * a * c);		
				
		double angleA = Math.toDegrees(Math.acos(rA));
		double angleB = Math.acos(rB) * (180 / Math.PI);  //same calculation as angleA, using math	
		double angleC = 180 - (angleA + angleB);
		
		if((angleA > 0 && angleA < 180) && (angleB > 0 && angleB < 180) && (angleC > 0 && angleC < 180)) {			
			System.out.printf("Angle A: %.2f\n", angleA);
			System.out.printf("Angle B: %.2f\n", angleB);
			System.out.printf("Angle C: %.2f\n",angleC);
		} else {
			System.out.println("This is not a triangle.");
		}
	}
}
