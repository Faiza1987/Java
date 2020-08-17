package Chapter5ProgramLogicAndIndefiniteLoops;


// Write a method named digitRange that accepts an integer as a parameter and returns the range of values of its digits. The range is defined as 1 more than the difference between the largest and smallest digit value. For example, the call of digitRange(68437) would return 6 because the largest digit value is 8 and the smallest is 3, so 8 - 3 + 1 = 6. If the number contains only one digit, return 1. You should solve this problem without using a String.

public class Exercise_5_20_digitRange {

	public static void main(String[] args) {
//		System.out.println(digitRange(68437));
//		System.out.println(digitRange(1));
		System.out.println(digitRange(0));
	}
	
	public static int digitRange(int number) {
		
		if(number == 0) {
			return 1;
		}
		
		int range = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		while(number != 0) {
			
			if(number % 10 < min) {
				min = number % 10;
			}
			if(number % 10 > max) {
				max = number % 10;
			}
			number /= 10;
		}
		
		return (max - min) + 1; 
	}

}
