package Chapter3ParametersAndObjects;

public class PrintReverse {
	public static void main(String[] args) {
		printReverse("");
	}
	
	public static void printReverse(String phrase) {
		
		for(int i = phrase.length() - 1; i >= 0; i--) {
			System.out.print(phrase.charAt(i));
		}
	}
}
