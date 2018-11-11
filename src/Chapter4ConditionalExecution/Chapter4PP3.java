package Chapter4ConditionalExecution;

import java.util.Scanner;

/* Write a program that prompts for a number and displays it in Roman numerals.  */

public class Chapter4PP3 {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a number up to 4000: ");
		String strNum = console.nextLine();
		
		String romanNumeral = "";
		int d = 0;
		double multiplier = Math.pow(10, (strNum.length() - 1));
				
		for(int i = 0; i < strNum.length(); i++) {
			d = (int)((strNum.charAt(i) - 48) * multiplier); //ASCII value of "1" is 49, "2" is 50, "3" is 51 ...
			multiplier /= 10;
			System.out.println(d);
			
			if(d >= 1000 && d < 4000) {
				for(int j = 1; j <= d / 1000; j++) {					
					romanNumeral += "M";
				}
			} else if(d == 900) {
				romanNumeral += "CM";
				
			} else if(d >= 500 && d <= 800) {
				romanNumeral += "D";
				for(int j = 1; j <= (d - 500) / 100; j++) {
					romanNumeral += "C";	
				}
			} else if(d == 400) {
				romanNumeral += "CD";
				
			} else if(d >= 100 && d <= 300) {
				for(int j = 1; j <= d / 100; j++) {
					romanNumeral += "C";
				}
			} else if (d == 90) {
				romanNumeral += "XC";
			} else if(d >= 50 && d <= 80) {
				romanNumeral += "L";
				for(int j = 1; j <= (d - 50) / 10; j++) {
					romanNumeral += "X";
				}
			} else if(d == 40) {
				romanNumeral += "XL";
			} else if(d >= 10 && d <= 30) {
				for(int j = 1; j <= d / 10; j++) {
					romanNumeral += "X";
				}
			} else if (d == 9) {
				romanNumeral += "IX";
			} else if(d >= 5 && d <= 8) {
				romanNumeral += "V";
				for(int j = 1; j <= (d - 5) / 1; j++) {
					romanNumeral += "I";
				}
			} else if(d == 4) {
				romanNumeral += "IV";
			} else if(d >= 1 && d <= 3) {
				for(int j = 1; j <= d / 1; j++) {
					romanNumeral += "I";
				}
			}
		}
		System.out.println(romanNumeral);

		console.close();
	}
}
