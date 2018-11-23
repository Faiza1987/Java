package Chapter5ProgramLogicAndIndefiniteLoops;

public class FirstWord {
	public static void main(String[] args) {
		System.out.println(firstWord("   Four score and seven"));
	}
	
	public static String firstWord(String s) {
		
		int start = 0;
		while((start < s.length()) && (s.charAt(start) == ' ')) {
			start++;
		}
		
		int stop = start;
		while ((stop < s.length()) && (s.charAt(stop) != ' ')) {
			stop++;
		}
		return s.substring(start, stop);
	}
}
