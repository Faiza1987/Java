package ParametersAndObjects;

public class CylinderSurfaceArea {
	
	public static void main(String[] args) {
		System.out.println(cylinderSurfaceArea(3.0, 4.5));
	}
	
	public static double cylinderSurfaceArea(double radius, double height) {
		
		double cylinderSurfaceAreaFormula = (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
		
		return cylinderSurfaceAreaFormula;
	}
}
