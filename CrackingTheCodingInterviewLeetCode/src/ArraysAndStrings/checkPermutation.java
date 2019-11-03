// Given 2 Strings, check if String 2 is a permutation of String 1

import java.util.Arrays;

public class checkPermutation {
	public static void main(String[] args) {
	     System.out.println(checkPermutation("Hello", "olleh")); // true
	     System.out.println(checkPermutation("Faiza", "Ahsan")); // false
	     System.out.println(checkPermutation("tea", "eat")); // true
	     System.out.println(checkPermutation("pan", "pen")); // false

	  }

	  public static Boolean checkPermutation(String word1, String word2){

		System.out.print(word1 + "\t" + word2 + "\t");
	    Boolean isPermutation = true;

	    if (word1.length() != word2.length()){
	    	isPermutation = false;
	      return isPermutation;
	    }

	    // turning the strings into Char arrays so I can sort the arrays
	    char[] wordOne = word1.toLowerCase().toCharArray();
	    char[] wordTwo = word2.toLowerCase().toCharArray();

	    
	    Arrays.sort(wordOne);
	    Arrays.sort(wordTwo);

	    for(int i = 0; i < wordOne.length; i++){
	    	
	      if (wordOne[i] != wordTwo[i]){
	    	isPermutation = false;
	        return isPermutation;
	      }
	    }
	    return isPermutation;
	  }
}
