package ParametersAndObjects;

public class LargerAbsValue {
	public static void main(String[] args) {
		//largerAbsVal(500, 500);
		System.out.println(largerAbsVal(501, 500));
	}
	
	public static int largerAbsVal(int num1, int num2) {
		if(num1 < 0) {
			num1 *= -1;
		} 
		if(num2 < 0) {
			num2 *= -1;
		} 
		if(num1 > num2) {
			return num1;
		} else if (num2 > num1) {
			return num2;
		} else {
			return -1;
		}
		
	}
	
//	public static void largerAbsVal(int num1, int num2) {
//		num1 = Math.abs(num1);
//		num2 = Math.abs(num2);
//		
//		if(num1 > num2) {
//			System.out.println(num1);
//		} else {
//			System.out.println(num2);
//		}
//	}
}
