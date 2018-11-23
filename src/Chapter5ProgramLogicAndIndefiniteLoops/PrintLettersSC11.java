package Chapter5ProgramLogicAndIndefiniteLoops;

/* Consider the flawed method printLetters that follows, which accepts a string as its parameter and attempts to print the letters of the string, separated by dashes. For example, the call of printLetters("Rabbit") should print R-a-b-b-i-t. The initial code shown is incorrect. Correct it to produce the desired behavior. (Your method should print nothing if the empty string ("") is passed.)
  */

public class PrintLettersSC11 {
	public static void main(String[] args) {
		printLetters("Leslie is awesome!");	
	}
	
	public static void printLetters(String text) {
		
		if(text.length()!= 0) {			
			System.out.print(text.charAt(0));
			for(int i = 1; i <= text.length() - 1; i++) {
				System.out.print("-" + text.charAt(i));
			}
		}
		System.out.println();
	}
}

//			while(text.charAt(i) != ' ' && text.charAt(i) == '-') {				
//				start++;
//			}
//
//			if(text.charAt(i) == ' ') {
//				break;
//			}