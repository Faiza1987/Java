package Chapter7Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Write a method called mode that returns the most frequently occurring element of an array of integers. Assume that the array has at least one element and that every element in the array has a value between 0 and 100 inclusive. Break ties by choosing the lower value.
//
//For example, if the array passed contains the values {27, 15, 15, 11, 27}, your method should return 15. (Hint: You may wish to look at the Tally program from earlier in this chapter to get an idea of how to solve this problem.)


public class Exercise_7_5_mode {

	public static void main(String[] args) {
		int[] arr = {27, 15, 15, 11, 27};
		int[] arr2 = {33, 33, 44, 44, 55, 55, 66, 66, 77, 77};
		
		mode(arr);

	}
	
	public static int mode(int[] arr) {
		
		Map<Integer, Integer> countOfInts = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			// if key is present, increment value
			if(countOfInts.containsKey(arr[i])) {
				countOfInts.put(arr[i], countOfInts.get(arr[i]) + 1);
				
			} else {
				countOfInts.put(arr[i], 1);
			}
		}

		Map.Entry<Integer, Integer> maxEntry = null;
		Integer key = null;
		
		// PRINT
		for (Map.Entry<Integer, Integer> entry : countOfInts.entrySet()) {
		    System.out.println(entry.getKey() + "/" + entry.getValue());

		    
		    if(maxEntry == null || entry.getValue() > maxEntry.getValue()) {
		    	maxEntry = entry;
			    key = maxEntry.getKey();
		    }
		    
		    if(entry.getValue() == maxEntry.getValue() && entry.getKey() < maxEntry.getKey()) {
		    	key = entry.getKey();
		    }
		}
		
		
	    System.out.println("Max Entry: " + maxEntry);
	    System.out.println("Key: " + key);
	    return key;
	}
}
