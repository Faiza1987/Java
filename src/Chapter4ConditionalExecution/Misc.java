package Chapter4ConditionalExecution;

public class Misc {
	public static void main(String[] args) {
		
		//Print alphabet
//		for(char letter = 'a'; letter <= 'z'; letter++) {
//			System.out.print(letter + " ");
//		}
		
		//Remove all spaces from phrase
//		String phrase = "the rain in Spain";
//		String noSpaces = "";
//		
//		for(int i = 0; i < phrase.length(); i++) {
//			char ch = phrase.charAt(i);
//			
//			if(ch != ' ') {
//				noSpaces += ch; //noSpaces stores "theraininSpain" here
//			}
//		}
//		System.out.println(noSpaces);
		
		//Times table
//		for(int i = 1; i <= 10; i++) {
//			for(int j = 1; j <= 10; j++) {
//				System.out.printf("%5d", i * j);
//			}
//			System.out.println();
//		}
		
		//Division
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%8.3f", (double) i / j);
			}
			System.out.println();
		}
		
//		int x = 38;
//		int y = -152;
//		int grade = 86;
//		double angle = 87.4163;
//		String veggie = "carrot";
//		
//		System.out.printf("hello there\n");
//		System.out.printf("x=%d and y=%d\n", x, y);
//		System.out.printf("%d%%\n", (grade + 5));
//		System.out.printf("!%d!%6d%6d\n", grade, x, y);
//		//System.out.printf("%.2f %10.1f\n", angle);
//		System.out.printf("%s%12s!%-8s!\n", veggie, veggie, veggie);
	}
}
