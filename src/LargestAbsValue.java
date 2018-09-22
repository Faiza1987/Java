
public class LargestAbsValue {
	public static void main(String[] args) {
		System.out.println(largestAbsVal(54, -54, 30));
	}
	
	public static int largestAbsVal(int a, int b, int c) {
//		a = Math.abs(a);
//		b = Math.abs(b);
//		c = Math.abs(c);
//		
//		if((a > b) && (a > c)) {
//			return a;
//		} else if ((b > a) && (b > c)) {
//			return b;
//		} else {
//			return c;
//		}
		
		if(a < 0) {
			a *= -1;
		}
		if(b < 0) {
			b *= -1;
		}
		if(c < 0) {
			c *= -1;
		}
		if((a >= b) && (a >= c)) {
			return a;
		} else if ((b >= a) && (b >= c)) {
			return b;
		} else if ((c >= a) && (c >= b)) {
			return c;
		} else {
			return -1;
		}
	}
}
