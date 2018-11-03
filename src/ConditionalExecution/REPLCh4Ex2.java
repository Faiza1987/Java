package ConditionalExecution;

/* Write a method named repl that accepts a String and a number of repetitions 
 * as parameters and returns the String concatenated that many times. For 
 * example, the call repl("hello", 3) returns "hellohellohello". If the number 
 * of repetitions is 0 or less, an empty string is returned.
 */

public class REPLCh4Ex2 {
	public static void main(String[] args) {
		System.out.println(repl(" a long string ", 10));
	}
	
	public static String repl(String word, int num) {
		String concat = "";
		if(num > 0) {
			
			for(int i = 1; i <= num; i++) {
				concat += word;
			}
			
		} else {
			return "";
		}
		return concat;
	}
}
