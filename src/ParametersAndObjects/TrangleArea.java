package ParametersAndObjects;

public class TrangleArea {
	public static void main(String[] args) {
		System.out.println(triangleArea(8, 5.2, 7.1));
	}
	
	public static double triangleArea(double a, double b, double c) {
		
		double side = (a + b + c) / 2;
		double area = Math.sqrt(side * (side - a) * (side - b) * (side - c));
		
		return area;
	}
}
