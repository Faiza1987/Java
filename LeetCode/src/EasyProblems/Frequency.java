package EasyProblems;

import java.util.HashSet;
import java.util.Set;

public class Frequency {

	public static void main(String[] args) {
		int[] A = {1, 3, 6, 4, 1, 2};
		int[] B = {1, 2, 3};
		int[] C = {-1, -3};
		int[] D = {-1, 1, -2, 2, -19};
		int[] E = {9,8,7,6};
		
//		System.out.println(solution(A));
//		System.out.println(solution(B));
//		System.out.println(solution(C));
		System.out.println(solution(D));
//		System.out.println(solution(E));
	}

    public static int solution(int[] A) {
        
//        int num = 1;
//
//        Set<Integer> set = new HashSet<>();
//        
//        for(int i = 0; i < A.length; i++){
//            
//             if(!set.contains(A[i])){
//                 set.add(A[i]);
//             }
//        }
//        
//        for(Integer elem : set) {
//        	System.out.println(elem);
//        }
//        
//        while(num < Integer.MAX_VALUE){
//            
//            if(!set.contains(num)){
//                return num;
//            }
//            num++;
//        }
//        return -1;
    	
     
//            int ans = A[0];
//            for (int i = 1; i < A.length; i++) {
//                if (ans > A[i]) {
//                    ans = A[i];
//                }
//            }
//            return ans;
    	int countNegatives = 0;
    	for(int i = 0; i < A.length; i++) {
    		
    		if(A[i] < 0) {
    			countNegatives++;
    		}
    		
    		if(A[i] == 0) {
    			return 0;
    		}	
    	}
    	
    	if(countNegatives % 2 == 0) {
    		return 1;
    	} else {
    		return -1;
    	}
        
     }
}
