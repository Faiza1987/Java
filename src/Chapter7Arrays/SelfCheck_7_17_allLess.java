package Chapter7Arrays;

import java.util.Arrays;

//Write a method called allLess that accepts two arrays of integers and returns true if each element in the first array is less than the element at the same index in the second array.

//For example, if the two arrays passed are {45, 20, 300} and {50, 41, 600}, your method should return true. If the arrays are not the same length, you should return false.
		
public class SelfCheck_7_17_allLess {

	public static void main(String[] args) {
		int[] arr1 = {54, 20, 300};
		int[] arr2 = {50, 41, 600};
		
		System.out.println(allLess(arr1, arr2));
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[0]++);
		System.out.println(arr1[0]);

	}

	public static boolean allLess(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] >= arr2[i]) {
				return false;
			}
		}
		return true;
	}
}
