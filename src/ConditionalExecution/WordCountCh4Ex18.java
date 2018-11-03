package ConditionalExecution;

import java.util.Arrays;

/* Write a method called wordCount that accepts a String as its parameter and returns the number of words in the String. A word is a sequence of one or more nonspace characters (any character other than ' '). For example, the call wordCount("hello") should return 1, the call wordCount("how are you?") should return 3, the call wordCount(" this     string has     wide       spaces ") should return 5, and the call wordCount(" ") should return 0.*/

public class WordCountCh4Ex18 {
	public static void main(String[] args) {
		System.out.println(wordCount(" "));
	}
	
	public static int wordCount(String phrase) {
		
		int wordCount = 0;
		
		String[] splitPhrase = phrase.split("\\s+"); // '\\s+' groups all white spaces as a delimiter
		
		for(int i = 0; i < splitPhrase.length; i++) {
			
			if(splitPhrase[i].length() > 0) {
				wordCount++;
			}
		}
		return wordCount;
	}
}
