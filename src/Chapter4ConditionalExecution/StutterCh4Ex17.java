package Chapter4ConditionalExecution;
/* Write a method called stutter that accepts a parameter and returns the String with its characters returns repeated twice. For example, stutter("Hello!") returns "HHeelllloo!!" */

public class StutterCh4Ex17 {
	public static void main(String[] args) {
		System.out.println(stutter("hello"));
	}
	
	public static String stutter(String word) {
		
		String stutter = "";
		
		
		for(int i = 0; i < word.length(); i++) {
			  stutter += word.charAt(i); //adds characters of word to stutter one by one
			  stutter += word.charAt(i);	
		}
		return stutter;
	}
}
