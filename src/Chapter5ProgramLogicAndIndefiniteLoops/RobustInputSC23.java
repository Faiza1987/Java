package Chapter5ProgramLogicAndIndefiniteLoops;

import java.util.Scanner;

/*The following code is not robust against invalid user input. Change the code so that it will not proceed until the user has entered a valid age (any integer) and grade point average (GPA, any real number). You may assume that the user enters a single token of input each time when prompted. Here is a sample dialogue of how the code should behave:

Type your age: hello
Type your age: ?
Type your age: 3.14
Type your age: 25
Type your GPA: a
Type your GPA: bcd
Type your GPA: 2.5
age = 25, GPA = 2.5 */

public class RobustInputSC23 {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int age = 0;
		double gpa = 0;
		
		System.out.print("Type ypur age: ");
		while(!console.hasNextInt()) {
			console.next();
			System.out.println("Not an integer. Try again.");
			System.out.print("Type your age: ");
		}
		age = console.nextInt();
		
		System.out.print("Type your GPA: ");
		while(!console.hasNextDouble()) {
			console.next();
			System.out.println("Not a real number. Try again.");
			System.out.print("type your GPA: ");
		}
		gpa = console.nextDouble();
		
		System.out.println("Age = " + age + ", GPA = " + gpa);
		console.close();
	}
}
