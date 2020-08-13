package udemyJavaMasterclassArrays.SortDesc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] arr = getIntegers();
		
		printArray(arr);
		
//		sortArrayDesc(arr);
		
		printArray(newSortedArray(arr));
	}
	
	public static int[] getIntegers() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How big is the array? ");
		int arrSize = scan.nextInt();
		
		int[] intArray = new int[arrSize];
		
		// fill array
		for(int i = 0; i < intArray.length; i++) {
			System.out.print("Enter number: ");
			intArray[i] = scan.nextInt();
		}
		return intArray;
	}
	
	// print array
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Element at index " + i + ": " + array[i]);
		}
		System.out.println();
	}
	
	//sort array in descending order
	public static void sortArrayDesc(int[] arr) {
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j + 1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("\n=S=O-R=T=E=D=A=R=R=A=Y=");
		printArray(arr);			
	}
	
	// new sorted array
	public static int[] newSortedArray(int[] arr) {
//		int[] sortedArray = new int[arr.length];
//		
//		for(int i = 0; i < arr.length; i++) {
//			sortedArray[i] = arr[i];
//		}
		
		int[] sortedArray = Arrays.copyOf(arr, arr.length);
		
		// sort array
		boolean flag = true;
		int temp = 0;
		
		while(flag) {
			flag = false;
			
			for(int i = 0; i < sortedArray.length - 1; i++) {
				if(sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;
				}
			}
		}
		System.out.println("\n=S=O-R=T=E=D=A=R=R=A=Y=");
		return sortedArray;
		
	}
}
