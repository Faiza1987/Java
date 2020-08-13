package udemyJavaMasterclassArrays;

import java.util.Scanner;

public class Main {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
//		int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20};
////		myIntArray[5] = 50; // 50 is in index 5
//
//		System.out.println(myIntArray[0]);
//		System.out.println(myIntArray[6]);
//		System.out.println(myIntArray[8]);
//		System.out.println("==============================");
//		
//		int[] intArray = new int[10];
//		
//		for(int i = 0; i < intArray.length; i++) {
//			intArray[i] = i * 10;
//		}
//		printArray(intArray);
		
		int[] myIntegers = getIntegers(5);
		for(int i = 0; i < myIntegers.length; i++) {
			System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
		}
		System.out.println("The average is " + getAverage(myIntegers));
	}
	
	public static int[] getIntegers(int number) {
		int[] values = new int[number];
		
		for(int i = 0; i < number; i++) {
			System.out.println("Enter value #" + i + ": \r");
			values[i] = scan.nextInt();
		}

		return values;
		
	}
	
	public static double getAverage(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return (double) sum / (double) array.length;
	}
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Element: " + i + ", value is: " + array[i]);
		}	
	}
	

}
