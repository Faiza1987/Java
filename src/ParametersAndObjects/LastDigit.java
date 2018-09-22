package ParametersAndObjects;

public class LastDigit {
	public static void main(String[] args) {
		System.out.println(lastDigit(3572));
		System.out.println(lastDigit(-947));
		System.out.println(lastDigit(6));
		System.out.println(lastDigit(35));
		System.out.println(lastDigit(123456));
	}
	
	public static int lastDigit(int number) {
		int lastDigit = number % 10;
		if(lastDigit < 0) {
			lastDigit *= -1;
		}
		return lastDigit;
		
	}
}
