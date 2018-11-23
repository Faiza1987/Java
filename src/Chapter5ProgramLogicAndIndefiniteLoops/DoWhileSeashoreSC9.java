package Chapter5ProgramLogicAndIndefiniteLoops;

/* Write a do/while loop that repeatedly prints a certain message until the user tells the program to stop. The do/while is appropriate because the message should always be printed at least one time, even if the user types n after the first message appears. The message to be printed is as follows:

She sells seashells by the seashore.
Do you want to hear it again? y
She sells seashells by the seashore.
Do you want to hear it again? y
She sells seashells by the seashore.
Do you want to hear it again? n
*/

import java.util.Scanner;

public class DoWhileSeashoreSC9 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String answer;
		
		do {
			System.out.println("She sells seashells by the seashore.");
			System.out.print("Do you want to hear it again? (Y/N) ");	
			answer = console.nextLine().toLowerCase();
					
		} while(answer.equals("y"));
		
		console.close();
	}
}
