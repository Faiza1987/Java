package Chapter4ConditionalExecution;

public class ReturnValues {
	public static void main(String[] args) {
		//System.out.println(max(15, 5));
		
				
		String s = "four score and seven years ago";
		
		System.out.println(indexOf('a', s));
		System.out.println(indexOf('e', s));
		System.out.println(indexOf('r', s));
		System.out.println(indexOf('v', s));
	}
	
	public static int max(int x, int y) {
		if(x > y) {
			return x;
		} else {
			return y;
		}
	}
	
	public static int indexOf(char ch, String s) {
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ch) {
				return i;
			}
		}
		return -1;
	}
}
