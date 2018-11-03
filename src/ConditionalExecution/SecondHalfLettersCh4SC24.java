package ConditionalExecution;

public class SecondHalfLettersCh4SC24 {
	public static void main(String[] args) {

		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
				
		char[] alphabet = letters.toCharArray();
		int counter = 0;

		String word = "faiza husain".toLowerCase();
		
		for(int i = 0; i < word.length(); i++) {
			for(int j = 13; j < alphabet.length; j++) { // j = 13 because 26 / 2 = 13
				if(word.charAt(i) == alphabet[j]) {
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
}
