package ConditionalExecution;

public class MedianOf3 {
	public static void main(String[] args) {
		System.out.println(medianOf3(2, 4, 6));
		System.out.println(medianOf3(4, 2, 6));
		System.out.println(medianOf3(6, 4, 2));
		System.out.println(medianOf3(2, 6, 4));
		System.out.println(medianOf3(4, 6, 2));
		System.out.println(medianOf3(6, 2, 4));
	}
	
	public static int medianOf3(int n1, int n2, int n3) {
		
		// return n1 if n1 > n2 AND n1 < n3 OR n1 > n3 AND n1 < n2
		
		// return n2 if n2 > n1 AND n2 < n3 OR n2 < n1 AND n2 > n3
		
		if((n1 > n2) && (n1 < n3) || (n1 > n3) && (n1 < n2)) {
			return n1;
		} else if((n2 > n1) && (n2 < n3) || (n2 < n1) && (n2 > n3)) {
			return n2;
		} else {
			return n3;
		}
	}
}
