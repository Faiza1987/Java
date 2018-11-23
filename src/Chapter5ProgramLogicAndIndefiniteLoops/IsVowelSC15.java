package Chapter5ProgramLogicAndIndefiniteLoops;

/* Write a method named isVowel that returns whether a String is a vowel (a single-letter string containing a, e, i, o, or u, case-insensitively). */

public class IsVowelSC15 {
	public static void main(String[] args) {
		System.out.println(isVowel("obama"));
	}
	
	public static Boolean isVowel(String letter) {
		
		letter = letter.toLowerCase();
		boolean hasVowel = false;
		
		if((letter.equalsIgnoreCase("a")) || (letter.equalsIgnoreCase("e")) || (letter.equalsIgnoreCase("i")) || (letter.equalsIgnoreCase("o")) || (letter.equalsIgnoreCase("u"))) {
			hasVowel = true;
			//System.out.println(letter + " contains vowels!");
		} else {
			hasVowel = false;
			//System.out.println(letter + " does not contain a vowel :(");
		}
		
		return hasVowel;
	}
}
