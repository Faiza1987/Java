package easyProblems;

import java.util.HashMap;
import java.util.Map;

/*Given two stings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 
Constraints:
1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.*/


public class RansomeNote {

	public static void main(String[] args) {
		System.out.println(canBeConstructed("race", "racecar"));
	}
	
	public static boolean canBeConstructed(String ransomNote, String magazine) {
		Boolean canBeConstructed = true;

		if(magazine.length() < ransomNote.length()) {
			canBeConstructed = false;
		}
		
		Map<Character, Integer> freqOfLettersInRansomNote = putLettersInMap(ransomNote);
		Map<Character, Integer> freqOfLettersInMagazine = putLettersInMap(magazine);
		
		// print map
//        for (Map.Entry<Character,Integer> entry : freqOfLettersInMagazine.entrySet()) {
//            System.out.println("Key = " + entry.getKey() +
//                             ", Value = " + entry.getValue());
//    	}
//        System.out.println("==================");
//        for (Map.Entry<Character,Integer> entry : freqOfLettersInRansomNote.entrySet()) {
//            System.out.println("Key = " + entry.getKey() +
//                             ", Value = " + entry.getValue());
//    	}
		
        int i = 0;
//        System.out.println(ransomNote.charAt(i));
        char letter;
		while(canBeConstructed) {
			letter = ransomNote.charAt(i);
	        System.out.println(letter);

			if(freqOfLettersInMagazine.containsKey(letter)) {
				
				if(freqOfLettersInRansomNote.get(letter) <= freqOfLettersInMagazine.get(letter)) {
					i++;
				} else {
					canBeConstructed = false;
				}
			} else {
				canBeConstructed = false;
			}
		}
		return canBeConstructed;
	}
	
	private static Map<Character, Integer> putLettersInMap(String str) {
		Map<Character, Integer> freqOfLetters = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			// map does not contain letter
			char key = str.charAt(i);
			if(!freqOfLetters.containsKey(key)) {
				freqOfLetters.put(key, 1);
			} else {
				// key already exists in map
				freqOfLetters.put(key, freqOfLetters.get(key) + 1);
			}
		}
		
		return freqOfLetters;
	}

}
