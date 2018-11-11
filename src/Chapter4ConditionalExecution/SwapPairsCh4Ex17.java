package Chapter4ConditionalExecution;
 /* Write a method named swapPairs that accepts a String as a parameter and returns that String
with each pair of adjacent letters reversed. If the String has an odd number of letters, the last
letter is unchanged. For example, the call swapPairs("example") would return "xemalpe" and
the call swapPairs("hello there") would return "ehll ohtree". */

public class SwapPairsCh4Ex17 {
	public static void main(String[] args) {
		System.out.println(swapPairs("hello there"));
	}
	
	public static String swapPairs(String phrase) {
		
		String swappedWord = "";
		
		for(int i = 0; i < phrase.length() - 1; i+=2) {
			swappedWord += phrase.charAt(i + 1);
			swappedWord += phrase.charAt(i);
		}
		
		if(phrase.length() % 2 != 0) {
			swappedWord += phrase.charAt(phrase.length() - 1);
		}
		
		return swappedWord;
	}
}
