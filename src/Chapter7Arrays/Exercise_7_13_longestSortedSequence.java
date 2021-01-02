package Chapter7Arrays;

import java.util.Arrays;

/*
 * Write a method named longestSortedSequence that accepts an array of integers as a parameter and that returns the length of the longest sorted (nondecreasing) sequence of integers in the array. For example, if a variable named array stores the following values:

int[] array = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
then the call of longestSortedSequence(array) should return 4 because the longest sorted sequence in the array has four values in it (the sequence -3, 0, 14, 207). Notice that sorted means nondecreasing, which means that the sequence could contain duplicates. For example, if the array stores the following values:

int[] array2 = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19}
Then the method would return 5 for the length of the longest sequence (the sequence 3, 5, 5, 5, 8). Your method should return 0 if passed an empty array.*/

public class Exercise_7_13_longestSortedSequence {

	public static void main(String[] args) {
		int[] array = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
		int[] array2 = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19};
		int[] array3 = {}; 
		int[] array4 = {3}; 
		
		System.out.println(longestSortedSequence(array)); // 4 (the sequence -3, 0, 14, 207)
		System.out.println(longestSortedSequence(array2)); // 5 (the sequence 3, 5, 5, 5, 8)
//		System.out.println(longestSortedSequence(array3));
//		System.out.println(longestSortedSequence(array4));
	}
	
	public static int longestSortedSequence(int[] array) {
		
		if(array.length == 0) {
			return 0;
		}
		
		if(array.length == 1) {
			return 1;
		}
		
		int count = 0;
		int longestSequence = 0;
		
		int elem = array[0];
		
		for(int i = 1; i < array.length; i++) {

//			System.out.println("ELEM: " + elem);
//			System.out.println("I: " + array[i]);
			
			if(elem <= array[i]) {
				
				count++;
				elem = array[i];
				
//				System.out.println("COUNT: " + count);
//				System.out.println("LONGEST SEQ: " + longestSequence + "\n");
			}
			
			if(elem > array[i]) {
				count = 0;
				elem = array[i];
				
//				System.out.println("COUNT: " + count);
//				System.out.println("LONGEST SEQ: " + longestSequence + "\n");
			}
			
			
			if(count > longestSequence) {
				longestSequence = count;
			}
			
		}	
		return longestSequence + 1;
	}

}
