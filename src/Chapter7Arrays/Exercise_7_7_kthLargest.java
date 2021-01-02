package Chapter7Arrays;

import java.util.Arrays;

// Write a method called kthLargest that accepts an integer k and an array a as its parameters and returns the element such that k elements have greater or equal value. If k = 0, return the largest element; if k = 1, return the second largest element, and so on.

//For example, if the array passed contains the values {74, 85, 102, 99, 101, 56, 84} and the integer k passed is 2, your method should return 99 because there are two values at least as large as 99 (101 and 102).

//Assume that 0 <= k < a.length. (Hint: Consider sorting the array, or a copy of the array first.)

public class Exercise_7_7_kthLargest {

	public static void main(String[] args) {
		int[] array = {74, 85, 102, 99, 101, 56, 84};
		System.out.println(kthLargest(0, array));

	}
	
	public static int kthLargest(int k, int[] array) {
//		// sort array Ascending
//		System.out.println("Original Array: " + Arrays.toString(array));
//		
//		int temp = 0;
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array.length; j++) {
//				if(array[i] < array[j]) {
//					temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//				}
//			}
//		}
//		System.out.println("Sorted Array: " + Arrays.toString(array));
//		
//		int index = (array.length - 1) - k;
//		return array[index];
		
		
		// sort array Descending
		System.out.println("Original Array: " + Arrays.toString(array));
		
		int temp = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(array));
		
		return array[k];
	}

}
