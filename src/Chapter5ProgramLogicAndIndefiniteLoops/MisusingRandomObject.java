package Chapter5ProgramLogicAndIndefiniteLoops;

import java.util.*;

public class MisusingRandomObject {
	public static void main(String[] args) {
		
		//This code contains a bug
//		Random r = new Random();
//		
//		if(r.nextInt() % 2 == 0) {
//			System.out.println("Even number: " + r.nextInt()); // a new random number is generated
//		} else {
//			System.out.println("Odd number: " + r.nextInt()); //another random number is generated
//		}
		
		//This code beahves correctly
		Random r = new Random();
		int n = r.nextInt(100) + 1; //save random number between 1-100 into a variable
		
		if(n % 2 == 0) {
			System.out.println("Even number: " + n);
		} else {
			System.out.println("Odd number: " + n);
		}
	}
}
