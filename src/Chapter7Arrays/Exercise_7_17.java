package Chapter7Arrays;

import java.util.Arrays;

/*Write a static method named vowelCount that accepts a String as a parameter and returns an array of integers representing the counts of each vowel in the String. The array returned by your method should hold 5 elements: the first is the count of As, the second is the count of Es, the third Is, the fourth Os, and the fifth Us. Assume that the string contains no uppercase letters.

For example, the call vowelCount("i think, therefore i am") should return the array {1, 3, 3, 1, 0}.*/

public class Exercise_7_17 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(vowelCount("i think, therefore i am")));

	}
	
	public static int[] vowelCount(String phrase) {
		
		int[] countOfVowels = new int[5];
		for(int i = 0; i < phrase.length(); i++) {
			
			if(phrase.charAt(i) == 'a') {
				countOfVowels[0] += 1;
			}
			if(phrase.charAt(i) == 'e') {
				countOfVowels[1] += 1;
			}
			if(phrase.charAt(i) == 'i') {
				countOfVowels[2] += 1;
			}
			if(phrase.charAt(i) == 'o') {
				countOfVowels[3] += 1;
			}
			if(phrase.charAt(i) == 'u') {
				countOfVowels[4] += 1;
			}
		}
		
		return countOfVowels;
	}

}
