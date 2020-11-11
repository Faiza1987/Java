package Chapter7Arrays;

/*
Write a static method named isSorted that accepts an array of doubles as a parameter and returns true if the list is in sorted (nondecreasing) order and false otherwise. For example, if arrays named list1 and list2 store {16.1, 12.3, 22.2, 14.4} and {1.5, 4.3, 7.0, 19.5, 25.1, 46.2} respectively, the calls isSorted(list1) and isSorted(list2) should return false and true respectively. Assume the array has at least one element. A one-element array is considered to be sorted.
*/

public class Exercise_7_4_isSorted {

	public static void main(String[] args) {
		double[] list1 = {16.1, 12.3, 22.2, 14.4};
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		double[] list3 = {1.5};
		double[] list4 = {1.5, 4.3, 7.0, 19.5, 7.8, 25.1, 46.2};

		System.out.println(isSorted(list1)); // false
		System.out.println(isSorted(list2)); // true
		System.out.println(isSorted(list3)); // true
		System.out.println(isSorted(list4)); // false
	}

	public static boolean isSorted(double[] arr) {
		if(arr.length == 1) {
			return true;
		}

		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
