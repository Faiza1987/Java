package easyProblems;

import java.util.Arrays;

/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.*/

public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		System.out.println(reverseVowelsOfString("hello")); // holle
		System.out.println(reverseVowelsOfString("leetcode")); // leotcede
		System.out.println(reverseVowelsOfString("eva")); // ave
		System.out.println(reverseVowelsOfString("pull")); // pull
		System.out.println(reverseVowelsOfString("pulao")); //polau
		System.out.println(reverseVowelsOfString("aA")); // Aa
		System.out.println(reverseVowelsOfString("Arc")); // Arc



	}
	
	public static String reverseVowelsOfString(String str) {
		// convert string into character array
		char[] charStr = str.toCharArray();
		
		int startIndex = 0;
		int endIndex = charStr.length - 1;

		
		while(startIndex < endIndex) {
			
//			System.out.println("StartIndex: " + charStr[startIndex]);
//			System.out.println("EndIndex: " + charStr[endIndex] + "\n");
			
			// increment startIndex until at vowel
			if(!isVowel(charStr[startIndex])) {
				startIndex++;
			}
			
			// decrement endIndex until at vowel
			if(!isVowel(charStr[endIndex])) {
				endIndex--;
			}
			
			if(isVowel(charStr[startIndex]) && isVowel(charStr[endIndex])) {				
				//SWAP
				char temp = charStr[startIndex];
				charStr[startIndex] = charStr[endIndex];
				charStr[endIndex] = temp;
				
				startIndex++;
				endIndex--;
			}
		}
			
		System.out.println("Original String: " + str);
		return new String(charStr);
	}
	
	private static Boolean isVowel(char ch) {
		if( ch == 'a' || ch == 'A' ||
			ch == 'e' || ch == 'E' ||
			ch == 'i' || ch == 'I' ||
			ch == 'o' || ch == 'O' ||
			ch == 'u' || ch == 'U' )
		{	
			return true;
		}
		return false;
	}

}
