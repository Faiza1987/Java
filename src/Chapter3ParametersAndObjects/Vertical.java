package Chapter3ParametersAndObjects;

public class Vertical {
	public static void main(String[] args) {
		vertical("hey now");
	}
	
	public static String vertical(String phrase) {
		
		for(int i = 0; i < phrase.length(); i++) {
			System.out.println(phrase.charAt(i));
		}
		
		return phrase;
	} 
}
