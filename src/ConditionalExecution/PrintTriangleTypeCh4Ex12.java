package ConditionalExecution;

/* Write a method called printTriangleType that accepts three integer arguments representing the lengths of the sides of a triangle and prints what type of triangle it is. The three types are equilateral, isosceles, and scalene. An equilateral triangle has all three sides the same length, an isosceles triangle has two sides the same length, and a scalene triangle has three sides of different lengths. Here are some example calls to printTriangleType:

printTriangleType(5, 7, 7);
printTriangleType(6, 6, 6);
printTriangleType(5, 7, 8);
printTriangleType(12, 18, 12);
The output produced should be the following:

isosceles
equilateral
scalene
isosceles */

public class PrintTriangleTypeCh4Ex12 {
	public static void main(String[] args) {
		
		printTriangleType(5, 7, 7);
		printTriangleType(6, 6, 6);
		printTriangleType(5, 7, 8);
		printTriangleType(12, 18, 12);
	}
	
	public static void printTriangleType(int side1, int side2, int side3) {
		
		if((side1 == side2) && (side1 == side3) && (side2 == side3)) {
			System.out.println("Equilateral");
		
		} else if((side1 != side2) && (side1 != side3) && (side2 != side3)) {
			System.out.println("Scalene");
			
		} else {
			System.out.println("Isosceles");
		}
	}
}
