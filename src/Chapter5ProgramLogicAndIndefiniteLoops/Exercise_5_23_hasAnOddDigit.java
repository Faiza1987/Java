package Chapter5ProgramLogicAndIndefiniteLoops;


// Write a method named hasAnOddDigit that returns whether any digit of an integer is odd. Your method should return true if the number has at least one odd digit and false if none of its digits are odd. 0, 2, 4, 6, and 8 are even digits, and 1, 3, 5, 7, 9 are odd digits.

public class Exercise_5_23_hasAnOddDigit {

	public static void main(String[] args) {
//		System.out.println(hasAnOddDigit(4822116)); //true
		System.out.println(hasAnOddDigit(2448)); //false
		System.out.println(hasAnOddDigit(-7004)); // true
	}
	
	public static boolean hasAnOddDigit(int number) {
//		System.out.println("Number: " + number);
		
		if(number < 0) {
			number *= -1;
		}
		
//		System.out.println("Number: " + number);
		int digit = 0;
		while(number != 0) {
			digit = number % 10;
			System.out.println("DIGIT: " + digit);
			
			if(digit % 2 == 1) {
				return true;
			}
			number /= 10;
		}
		return false;
	}

}
