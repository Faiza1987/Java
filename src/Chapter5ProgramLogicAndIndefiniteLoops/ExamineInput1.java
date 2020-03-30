package Chapter5ProgramLogicAndIndefiniteLoops;

import java.util.*;

public class ExamineInput1 {
	public static void main(String[] args) {
		
		System.out.println("This program examines a token and tells you\n"
				+ "the ways in which it could be read.\n");
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Token? ");
		System.out.println(" hasNextInt = " + console.hasNextInt());
		System.out.println(" hasNextDouble = " + console.hasNextDouble());
		System.out.println(" hasNext = " + console.hasNext());
		
		console.close();
	}
}
