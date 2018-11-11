package Chapter4ConditionalExecution;

/* Write a program that prompts for an integer and reports the factors of the integer (i.e., the
numbers that go evenly into it). */


public class Chapter4PP1 {
	public static void main(String[] args) {
		
		int num = 36;
		int factors = 0;
		
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				
				System.out.print(i + " ");
			}
		}
	}
}
