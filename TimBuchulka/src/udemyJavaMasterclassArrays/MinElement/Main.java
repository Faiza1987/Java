package udemyJavaMasterclassArrays.MinElement;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = readIntegers();
		System.out.println("Minimum element: " + findMin(array));

	}
	
	public static int[] readIntegers() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many integers will you enter? ");
		int numOfInts = scan.nextInt();
		
		int[] myIntegers = new int[numOfInts];
		
		for(int i = 0; i < myIntegers.length; i++) {
			System.out.print("Enter #" + (i+ 1) + ": ");
			myIntegers[i] = scan.nextInt();
		}
		System.out.println("==============================");
		
		return myIntegers;
	}
	
	public static int findMin(int[] array) {
		int min = 999999999;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	

}
