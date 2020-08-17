package Chapter5ProgramLogicAndIndefiniteLoops;

// Write a method named digitSum that accepts an integer as a parameter and returns the sum of the digits of that number. For example, digitSum(29107) returns 2+9+1+0+7 or 19. For negative numbers, return the same value that would result if the number were positive. For example, digitSum(-456) returns 4+5+6 or 15.

public class Exercise_5_18_digitSum {

	public static void main(String[] args) {
		System.out.println(digitSum(29107));
		System.out.println(digitSum(-456));
	}

	public static int digitSum(int number) {
		int sum = 0;	
		while(number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum < 0 ? sum * -1 : sum;
	}
}
