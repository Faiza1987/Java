package ParametersAndObjects;

import java.util.Scanner;

public class Chapter3PP5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Latitude 1: ");
		double latitude1 = Math.toRadians(input.nextDouble());
		
		System.out.print("Enter Longitude 1: ");
		double longitude1 = Math.toRadians(input.nextDouble());
		
		System.out.print("Enter Latitude 2: ");
		double latitude2 = Math.toRadians(input.nextDouble());
		
		System.out.print("Enter Longitude 2: ");
		double longitude2 = Math.toRadians(input.nextDouble());
		input.close(); 
		
		distanceBetweenTwoPoints(latitude1, longitude1, latitude2, longitude2);
	}
	
	public static void distanceBetweenTwoPoints(double latitude1, double longitude1, double latitude2, double longitude2) {
		
		
		double distance = 6372.795 * (Math.acos(Math.sin(latitude1) * Math.sin(latitude2) + Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude2 - longitude1)));
		
		System.out.printf("\nThe distance between location 1 and location 2 is: %.3f km", distance);
		//System.out.println(" km.");
	}
}
