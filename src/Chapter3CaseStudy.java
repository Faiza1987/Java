//This program computes the trajectory of a projectile
import java.util.Scanner;

public class Chapter3CaseStudy {
	public static final double EARTH_ACCELERATION= -9.81; //meters/second^2. Gravity is defined as a negative number because it decreases the y-velocity of an object(pulling it down as opposed to pushing it away)
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		giveIntro();
		
		System.out.print("Velocity (meters/second)?");
		double velocity = console.nextDouble();
		
		System.out.print("Angle relative to horizontal (degrees)?");
		double angle = Math.toRadians(console.nextDouble());
		
		System.out.print("Number of steps to display?");
		int steps = console.nextInt();
		System.out.println();
		console.close();
		
		printTable(velocity, angle, steps);
	}
	
		/* Prints a table showing the trajectory of an object given its initial velocity and angle and including the given number of steps in the table. */
	public static void printTable(double velocity, double angle, int steps) {
		double xVelocity = velocity * Math.cos(angle);
		double yVelocity = velocity * Math.sin(angle);
		double totalTime = -2.0 * yVelocity / EARTH_ACCELERATION;
		double timeIncrement = totalTime / steps;
		double xIncrement = xVelocity * timeIncrement;
		
		//set all of x, y and t to 0
		double x = 0.0;
		double y = 0.0;
		double t = 0.0;
		System.out.println("step\tx\ty\ttime");
		System.out.println("0\t0.0\t0.0\t0.0");
		//for (given number of steps)
		for(int i = 1; i <= steps; i++) {			
			t += timeIncrement;
			x += xIncrement;
			y = yVelocity * t + 0.5 * EARTH_ACCELERATION * t * t;
			System.out.println(i + "\t" + round2(x) + "\t" + round2(y) + "\t" + round2(t));
		}
	}
	
	//Gives a brief introduction to the user
	public static void giveIntro() {		
		System.out.println("This program computes the trjacetory of a\nprojectile given its initial velocity and\nits angle relative to the horizontal. Use\nan even number of steps if you want to include\nthe high point reached by the projectile.");
		System.out.println();
	} 
		
	/* Returns the horizontal displacement for a body given its initial velocity v, elapsed time t, and acceleration a */
	public static double displacement(double v, double t, double a) {
		return v * t + 0.5 * a * t *t;
	}
		
	//Rounds n to 2 digits after the decimal point
	public static double round2(double n) {
		return (int) (n * 100.0 + 0.5) / 100.0;
	}
}
