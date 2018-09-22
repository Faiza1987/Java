package ParametersAndObjects;

public class CalculatePay {
	public static void main(String[] args) {
		System.out.println(pay(4.00, 11));
	}
	
	public static double pay(double salary, int hours) {
				
		if(hours <= 8) {
			return salary * hours;
			
		} else {
						//32    +          6      *      3 = 
			return (salary * 8) + ((salary * 1.5) * (hours - 8));
		}
		// return -1;
	}
}
