package Chapter8Classes;

import java.awt.Point;

/*Add the following method to the Point class:

public void flip()

Negates and swaps the x/y coordinates of the Point object. For example, if the object initially represents the point (5, -3), after a call to flip, the object should represent (3, -5). If the object initially represents the point (4, 17), after a call to flip, the object should represent (-17, -4).


public class Point {
    private int x;
    private int y;
    
    // // your code goes here
    
}*/


public class Exercise_8_2_flipPoints {

	public static void main(String[] args) {
		
		Point p1 = new Point(-4, -17);
		
		System.out.println("X: " + p1.x);
		System.out.println("Y: " + p1.y + "\n");
		
		flip(p1);
	}
	
	public static void flip(Point p1) {
		
		Point p2 = new Point();
		p2.x = p1.x;
		p2.y = p1.y;
		
		System.out.println("P2 X: " + p2.x);
		System.out.println("P2 Y: " + p2.y + "\n");
		
		if((p2.x > -1) && (p2.y > -1)) {
			
			p2.x *= -1;
			p2.y *= -1;
			
			System.out.println("NEGATIVE");
			System.out.println("P2 X: " + p2.x);
			System.out.println("P2 Y: " + p2.y);
		}

		if((p2.x < 0) && (p2.y < 0)) {
			
			p2.x *= -1;
			p2.y *= -1;
			
			System.out.println("POSITIVE");
			System.out.println("P2 X: " + p2.x);
			System.out.println("P2 Y: " + p2.y);
		}
		
		// x < 0 && y > 0
		// x > -1 y < 0
		
		int tempX = p2.x;
		p2.x = p2.y;
		p2.y = tempX;
		
		System.out.println("\nFLIPPED");
		System.out.println("P2 X: " + p2.x);
		System.out.println("P2 Y: " + p2.y);
		
		System.out.println("\nORIGINAL");
		System.out.println("X: " + p1.x);
		System.out.println("Y: " + p1.y + "\n");
	}

}
