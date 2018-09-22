
public class MathClass {
	public static void main(String[] args) {
		System.out.println("15000 feet is " + miles(15000) + " miles.");
	}
	
	public static void sqrt() {
		for(int i = 1; i <= 20; i++) {
			System.out.println("sqrt(" + i + ") = " + Math.sqrt(i)); 
		}
	}
	
	public static void mathMethods() {
		System.out.println("Absolute value: " + Math.abs(-308)); // returns absolute value
		System.out.println("Ceiling: " + Math.ceil(2.13)); //rounds a number upwards
		System.out.println("Cosine: " + Math.cos(Math.PI)); //cosine (radians)
		System.out.println("Exponent base e: " + Math.exp(1)); //exponent base e
		System.out.println("Floor: " + Math.floor(2.93)); //rounds a number downwards
		System.out.println("Logarithm base e: " + Math.log(Math.E)); //logarithm base e
		System.out.println("Logarithm base 10: " + Math.log10(1000)); //logarithm base10
		System.out.println("Maximum of 2 numbers: " + Math.max(45, 207)); //maximum of two values
		System.out.println("Minimum of 2 numbers: " + Math.min(3.8, 2.75)); //minimum of two values
		System.out.println("To the power of: " + Math.pow(3, 4)); //power (general exponentiation)
		System.out.println("Random number: " + Math.random()); // returns a random value
		System.out.println("Sine: " + Math.sin(0)); // sine
		System.out.println("Square root of a number: " + Math.sqrt(2)); // returns the square root of a number
		System.out.println("To Degrees: " + Math.toDegrees(Math.PI)); //converts radian angles to degrees
		System.out.println("To Radians: " + Math.toRadians(270.0)); //converts degree angles to radians
		
	}
	
	public static double miles(double feet) {
		return feet / 5280.0;
	}
}	
