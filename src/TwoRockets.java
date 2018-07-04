import java.util.Collections;

public class TwoRockets {
	public static void main(String[] args) {
		triangle();
		line();
		box1();
		line();
		box2();
		line();
		box1();
		line();
		triangle();
	}
	
	public static void triangle() { 
		System.out.println(String.join(  "    ", Collections.nCopies(2, "   /\\")));
		System.out.println(String.join(  "   ", Collections.nCopies(2, "  /  \\")));
		System.out.println(String.join(  "  ", Collections.nCopies(2, " /    \\")));
	}
	
	public static void line() {
		System.out.println(String.join(" ", Collections.nCopies(2, "+------+")));
	}
	
	public static void box1() {
		System.out.println(String.join(" ", Collections.nCopies(2, "|      |")));
		System.out.println(String.join(" ", Collections.nCopies(2, "|      |")));
	}
	
	public static void box2() {
		System.out.println(String.join(" ", Collections.nCopies(2, "|United|")));
		System.out.println(String.join(" ", Collections.nCopies(2, "|States|")));
	}
}
