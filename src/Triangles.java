
public class Triangles {
	public static void main(String[] args) {
//		System.out.println("Hypotenuse 1 = " + hypotenuse(5, 12));
//		System.out.println("Hypotenuse 2 = " + hypotenuse(3, 4));
		String one = "two";
		String two = "three";
		String three = "1";
		int number = 20;
		
		sentence(one, two, 3);
		sentence(two, three, 14);
	}
	
	public static double hypotenuse(double a, double b) {
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println(c);
		return c;
	}
	
	public static void sentence(String three, String one, int number) {
		System.out.println(one + " times " + three + " = " + (number * 2));
	}
}
