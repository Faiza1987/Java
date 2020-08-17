package Chapter5ProgramLogicAndIndefiniteLoops;

// Write a method named firstDigit that returns the first digit of an integer. For example, firstDigit(3572) should return 3. It should work for negative numbers as well. For example, firstDigit(-947) should return 9.

public class Exercise_5_19_firstDigit {
	public static void main(String[] args) {
		System.out.println(firstDigit(-947));
		System.out.println(firstDigit(3572));
	}
	
	public static int firstDigit(int number) {
		int first = 0;

		System.out.println("Number: " + number);
		
		while(number != 0) {
			first = number % 10;
			number /= 10;
		}
		return first < 0 ? first * -1 : first;
	}
}
