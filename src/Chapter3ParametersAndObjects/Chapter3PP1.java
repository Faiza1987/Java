package Chapter3ParametersAndObjects;

public class Chapter3PP1 {
	public static void main(String[] args) {
		christmasTree(3, 5);
	}
	
	public static void christmasTree(int segments, int height) {
		int addStar = 0;	
		int stars = 0;
		
		for(int seg = 1; seg <= segments; seg++) {
			
			for(int line = 1; line <= height; line++) {
				for(int sp = 1; sp <= (segments - seg) + height - line; sp++) {
					System.out.print(" ");
				}
				for(stars = 1; stars <= (line * 2) - 1 + addStar; stars++) {
					System.out.print("*");
				}
				System.out.println();
			}
			addStar += 2;
		}
		
		//Stem
		for(int star = 1; star <= 2; star ++) {			
			for(int sp = 1; sp <= (stars - 1) / 2; sp++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.print("*******");
		System.out.println("*******");
	}
}
