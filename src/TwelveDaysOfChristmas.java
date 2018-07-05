
public class TwelveDaysOfChristmas {
	public static void main(String[] args) {
		day("first");
		first();
		System.out.println();
		day("second");
		second();
		System.out.println();
		day("third");
		third();
		System.out.println();
		day("fourth");
		fourth();
		System.out.println();
		day("fifth");
		fifth();
		System.out.println();
		day("sixth");
		sixth();
		System.out.println();
		day("seventh");
		seventh();
		System.out.println();
		day("eighth");
		eighth();
		System.out.println();
		day("ninth");
		ninth();
		System.out.println();
		day("tenth");
		tenth();
		System.out.println();
		day("eleventh");
		eleventh();
		System.out.println();
		day("twelfth");
		twelfth();
	}
	
	public static void day(String dayOfWeek) {
		System.out.println("On the " + dayOfWeek + " day of christmas my true love sent to me");
	}
	
	public static void first() {
		System.out.println("A partrdige in a pear tree");
	}
	
	public static void second() {
		System.out.println("Two turtle doves, and");
		first();
	}
	
	public static void third() {
		System.out.println("Three french hens");
		second();
	}
	
	public static void fourth() {
		System.out.println("Four colly birds");
		third();
	}
	
	public static void fifth() {
		System.out.println("Five gold rings");
		fourth();
	}
	
	public static void sixth() {
		System.out.println("Six geese a-laying");
		fifth();
	}
	
	public static void seventh() {
		System.out.println("Seven swans a-swimming");
		sixth();
	}
	
	public static void eighth() {
		System.out.println("Eight maids a-milking");
		seventh();
	}
	
	public static void ninth() {
		System.out.println("Nine ladies dancing");
		eighth();
	}
	
	public static void tenth() {
		System.out.println("Ten lords a-leaping");
		ninth();
	}
	
	public static void eleventh() {
		System.out.println("Eleven pipers piping");
		tenth();
	}
	
	public static void twelfth() {
		System.out.println("Twelve drummers drumming");
		eleventh();
	}
}
