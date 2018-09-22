package ParametersAndObjects;

public class PadString {
	public static void main(String[] args) {
		padString("congratulations", 10);
	}
	
	public static String padString(String phrase, int length) {
		
		String paddedPhrase = phrase;
		
		while(paddedPhrase.length() < length) {
			paddedPhrase = " " + paddedPhrase;
		}
		System.out.println(paddedPhrase);
		return paddedPhrase;
	}
}
