package Chapter3ParametersAndObjects;

public class Quadratic {
	public static void main(String[] args) {
		quadratic(1, -69, 69);
	}
	
	public static void quadratic(int a, int b, int c) {
		
		double firstRoot = 0;
		double secondRoot = 0;
		
		if(((b * b) - (4 * a * c) >= 0) && (a != 0)) {
			
			firstRoot = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
			secondRoot = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);	
			
			System.out.println("First root = " + firstRoot);
			System.out.println("Second root = " + secondRoot);
			System.out.println(firstRoot + secondRoot);
			System.out.println(firstRoot * secondRoot);
			
		} else {
//			System.out.println("There are no real roots.");
			throw new IllegalArgumentException("There are no real roots.");
		} 
	}
}
