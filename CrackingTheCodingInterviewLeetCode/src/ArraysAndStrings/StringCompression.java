
public class StringCompression {
	public static void main(String[] args) {
		System.out.println(compressString("aaabcccccaaa"));
	}
	
	public static String compressString(String word) {
		if(word.length() == 0) {
			return word;
		}
		
		String compressed = Character.toString(word.charAt(0));
		int count = 1;
		
		if (word.length() == 1){
			return compressed + Integer.toString(count);
		}
		
		for(int i = 0; i < word.length() - 1; i++) {
			if(word.charAt(i) == word.charAt(i + 1)) {
				count++;
			} else {
				compressed += Integer.toString(count) + Character.toString(word.charAt(i + 1));
				count = 1;
			}
		}
		compressed += Integer.toString(count);
		return compressed;
	}
}
