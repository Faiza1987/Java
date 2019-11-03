// Implement an algorithm to determine if a string has all unique characters
import java.util.Hashtable;

public class IsUnique {
	public static void main(String[] args) {
		System.out.println(hasAllUnique("faiza"));
	}
	
	public static Boolean hasAllUnique(String word) {
		
		Boolean isUnique = true;
		
		if (word.length() == 0) {
			return isUnique;
		}
		
		Hashtable<Character, Integer> hash = new Hashtable<>();
		
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			
			if(hash.containsKey(c)) {
				hash.put(c, hash.get(c) + 1);
			} else {
				hash.put(c, 1);
			}
		}		
		if(hash.size() == word.length()) {
			return isUnique;
		} else {
			isUnique = false;
		}
		return isUnique;
	}
}
