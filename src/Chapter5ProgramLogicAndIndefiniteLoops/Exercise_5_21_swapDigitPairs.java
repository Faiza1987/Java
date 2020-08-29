package Chapter5ProgramLogicAndIndefiniteLoops;

//Write a method named swapDigitPairs that accepts a positive integer n as a parameter and returns a new integer whose value is similar to n's but with each pair of digits swapped in order. For example, the call of swapDigitPairs(482596) would return 845269. Notice that the 9 and 6 are swapped, as are the 2 and 5, and the 4 and 8. If the number contains an odd number of digits, leave the leftmost digit in its original place. For example, the call of swapDigitPairs(1234567) would return 1325476. You should solve this problem without using a String.


public class Exercise_5_21_swapDigitPairs {

	public static void main(String[] args) {
		System.out.println(swapDigitPairs(482596));
		System.out.println(swapDigitPairs(1234567));
	}
	
//	public static int swapDigitPairs(int number) {
//		int digitCount = 0;
//		int temp = number;
//		double factor = 0.01;
//		while (temp != 0) {
//			digitCount++;
//			temp /= 10;
//			factor *= 10;
//		}
//		int newInt = 0;
//		if(digitCount % 2 != 0) {
//			newInt = (int)(number / Math.pow(10, digitCount-1));
//			number = (int)(number % Math.pow(10, digitCount-1));
//			digitCount--;
//			factor /= 10;
//		}
//		while (digitCount > 0) {
//			int b = (int)(number/factor) % 10;
//			int a  = (int)(number/factor)/10 > 99 ? ((int)(number/factor)/10) % 10 : (int)(number/factor)/10;
//			newInt *= 100;
//			newInt += (b*10) + a;
//			factor /= 100;
//			digitCount -= 2;			
//		}
//		return newInt;
//	}

	public static int swapDigitPairs(int number) {
	    int newInt = 0;
	    int factor = 1;
	    while (number > 9) {
	        newInt += factor * 10 * (number % 10);
	        number /= 10;
	        newInt += factor * (number % 10);
	        number /= 10;
	        factor *= 100;
	        System.out.println(newInt);
	    }
	    return newInt + factor * number;
	}

}
