//This program finds the Body Mass Index for two people.

package Chapter4ConditionalExecution;

import java.util.Scanner;

public class BMI_CaseStudy {
	public static void main(String[] args) {
		
		giveIntro();
		Scanner console = new Scanner(System.in);
		double bmi1 = getBMI(console);
		double bmi2 = getBMI(console);
		reportResults(bmi1, bmi2);
	}
	
	//Introduces the program to the user
	public static void giveIntro() {
		System.out.println("This program reads in data for two people\n"
				+ "and computes their Body Mass Index (BMI)\n"
				+ "and weight status.");
		System.out.println();
	}
	
	//Prompts for one person's statistics, returning the BMI
	public static double getBMI(Scanner console) {
		System.out.println("Enter next person's information:");
		
		System.out.print("Height (in inches): ");
		double height = console.nextDouble();
		
		System.out.print("Weight (in pounds): ");
		double weight = console.nextDouble();
		
		//BMI Formula => weight(lb) / (height(in) * height(in)) * 703
		double bmi = weight / (height * height) * 703;
		System.out.println();
		
		return bmi;
	}
	
	/*This method contains the body mass index(bmi) formula for converting
	the given height (in inches) and weight (in pounds) into a BMI */
	public static double BMIFormula(double height, double weight) {
		return weight / (height * height) * 703;
	}
	
	//Reports the weight status for the given BMI value
	public static void reportStatus(double bmi) {
		if(bmi < 18.5) {
			System.out.println("Underweight");
		} else if(bmi < 25) {
			System.out.println("Normal");
		} else if(bmi < 30) {
			System.out.println("Overweight");
		} else { //bmi >= 30
			System.out.println("Obese");
		}
	}
	
	//Reports the overall BMI values and weight status to the user
	public static void reportResults(double bmi1, double bmi2) {
		
		System.out.printf("Person #1\'s body mass index: %4.2f\n", bmi1);
		reportStatus(bmi1);
		
		System.out.println();
		
		System.out.printf("Person #2\'s body mass index: %4.2f\n", bmi2);
		reportStatus(bmi2);
	}
}
