
public class Quadratic {
	public static void main(String[] args) {
		quadratic(3, 6, 3);
	}
	
	public static void quadratic(int a, int b, int c) {
		
		double firstRoot = 0;
		double secondRoot = 0;
		
		if((b * b) - (4 * a * c) >= 0) {
			
			firstRoot = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
			secondRoot = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);	
			
			System.out.println("First root = " + firstRoot);
			System.out.println("Second root = " + secondRoot);
			
		} else {
			System.out.println("There are no real roots.");
		} 
	}
}
