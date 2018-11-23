package Chapter5ProgramLogicAndIndefiniteLoops;

/* Using "Boolean Zen," write an improved version of the following method, which returns whether the given string starts and ends with the same character. (In other words, remove unnecessary logical tests and remove if/else statements that test the value of a boolean variable.) */

public class StartEndSameSC18 {
	public static void main(String[] args) {
		System.out.println(startEndSame("hello"));
	}
	
	public static boolean startEndSame(String str) {
		
		//Boolean Zen version
		boolean letter = str.charAt(0) == str.charAt(str.length() - 1);
		
		return letter;
		
//		if (str.charAt(0) == str.charAt(str.length() - 1)) {
//			return true;
//		} else {
//			return false;
//		}
	}
}
