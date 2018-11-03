package ConditionalExecution;

public class Oops4 {
	public static void main(String[] args){
		
		int a = 72;
		int b = 42;
		
		minimum(a, b);
	}
	
	public static int minimum(int a, int b) {
		int smaller = 0;
		if(a < b) {
			smaller = a;
		} else {
			smaller = b;
		}
		if(smaller == a) {
			System.out.println("a is the smallest!");
		} else {
			System.out.println("b is the smallest!");
		}
		return smaller;
	}
}
