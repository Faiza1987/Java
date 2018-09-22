package ParametersAndObjects;

public class Scientific {
	public static void main(String[] args) {
		System.out.println(scientific(6.23, 5.0));
	}
	
	public static double scientific(double base, double exponent) {
		
		double normalNotation = base * Math.pow(10, exponent);
		
		return normalNotation;
	}
}
