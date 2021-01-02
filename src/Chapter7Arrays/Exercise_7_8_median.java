package Chapter7Arrays;

import java.util.Arrays;

/*Write a method called median that accepts an array of integers as its argument and returns the median of the numbers in the array. The median is the number that will appear in the middle if you arrange the elements in order. Assume that the array is of odd size (so that one sole element constitutes the median) and that the numbers in the array are between 0 and 99 inclusive.

For example, the median of {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17} is 5, and the median of {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27} is 25.

(Hint: You may wish to look at the Tally program from earlier in this chapter for ideas.)*/


public class Exercise_7_8_median {

	public static void main(String[] args) {
		int[] array = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
		int[] array2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
		System.out.println(median(array2));

	}

	public static int median(int[] array) {
		//sort array Ascending
		System.out.println("Original Array: " + Arrays.toString(array));
		for(int i = 0; i < array.length; i++) {
			int temp = 0;
			for(int j = 0; j < array.length; j++) {
				if(array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(array));
		
		return array[array.length / 2];
	}
}
