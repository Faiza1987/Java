package Chapter7Arrays;

import java.util.Arrays;

// Write a method called equals that takes in two string arrays and returns true if they are equal; that is, if both arrays have the same length and contain equivalent string values at each index.


public class SelfCheck_7_16b_equalsStrings {

	public static void main(String[] args) {
		String[] arr1 = {"hi", "bye", "how", "are", "you", "how", "do", "you", "do", "?"};
		String[] arr2 = {"hi", "bye", "how", "are", "you", "how", "do", "you all", "do", "?"};
		
		System.out.println(equals(arr1, arr2));

	}
	
	public static boolean equals(String[] arr1, String[] arr2) {
		
		if(arr1.length != arr2.length) {
			return false;
		}
		
		// return Arrays.equals(arr1, arr2);
		
		// OR

		for(int i = 0; i < arr1.length; i++) {
			if(!(arr1[i].equals(arr2[i]))) {
				return false;
			}
		}
		
		return true;
	}
	
}
