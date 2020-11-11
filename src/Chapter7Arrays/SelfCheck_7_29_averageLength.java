package Chapter7Arrays;

//Write a method averageLength of code that computes and returns the average String length of the elements of an array of Strings. For example, if the array contains {"belt", "hat", "jelly", "bubble gum"}, the average length returned should be 5.5. Assume that the array has at least one element.

public class SelfCheck_7_29_averageLength {

	public static void main(String[] args) {
		String[] arr = {"belt", "hat", "jelly", "bubble gum"};
		System.out.println(averageLength(arr));

	}
	
	public static double averageLength(String[] arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i].length();
		}
		return (sum / arr.length);
	}

}
