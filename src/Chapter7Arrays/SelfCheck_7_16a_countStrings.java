package Chapter7Arrays;

// Write a method countStrings that takes an array of Strings and a target String and returns the number of occurrences target appears in the array.

public class SelfCheck_7_16a_countStrings {

	public static void main(String[] args) {
		String[] strArr = {"f", "a", "i", "z", "a", "A", "h", "s", "a", "n"};
		System.out.println(countStrings(strArr, "a"));
		
		String[] strArr2 = {"hi", "bye", "how", "are", "you", "how", "do", "you", "do"};
		System.out.println(countStrings(strArr2, "how"));

	}
	
	public static int countStrings(String[] strArr, String target) {
		int occurrences = 0;
		
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].equalsIgnoreCase(target)) {
				occurrences++;
			}
		}
		
		return occurrences;
	}
}
