package Chapter5ProgramLogicAndIndefiniteLoops;

/* Write a do/while loop that repeatedly prints random numbers from 0 to 999 (inclusive) until a number above 900 (that is, greater than or equal to 900) is printed. At least one line of output should always be printed, even if the first random number is above 900. Here is a sample execution:

Random number: 235
Random number: 15
Random number: 810
Random number: 147
Random number: 915 */


import java.util.Random;

public class RandomOver900SC11 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int num = 0;
		
		do {			
			num = r.nextInt(999);
			System.out.println("Random number: " + num);
			
		} while (num <= 900);
	}
}
