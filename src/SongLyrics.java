
public class SongLyrics {
	public static void main(String[] args) {
		oldLady("fly");
		verse1();
		System.out.println();
		verse2();
		System.out.println();
		verse3();
		System.out.println();
		verse4();
		System.out.println();
		verse5();
		System.out.println();
		verse6();
		
	}
	
	public static void oldLady(String animal) {
		System.out.println("There was an old lady who swallowed a " + animal);
	}
	
	public static void die() {
		System.out.println("Perhaps she'll die.");
	}
	
	public static void fly() {
		System.out.println("I don't know why she swallowed that fly,");
		die();
	}
	
	public static void spider() {
		System.out.println("She swallowed the spider to catch the fly,");
	}
	
	public static void bird() {
		System.out.println("She swallowed the bird to catch the spider,");
	}
	
	public static void cat() {
		System.out.println("She swallowed the cat to catch the bird,");
	}
	
	public static void verse1() {
		fly();
	}
	
	public static void verse2() {
		oldLady("Spider");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		spider();
		fly();
	}
	
	public static void verse3() {
		oldLady("bird");
		System.out.println("How absurd to swallow a bird.");
		bird();
		spider();
		fly();
	}
	
	public static void verse4() {
		oldLady("cat");
		System.out.println("Imagine that to swallow a cat.");
		cat();
		bird();
		spider();
		fly();
	}
	
	public static void verse5() {
		oldLady("dog");
		System.out.println("What a hog to swallow a dog.\n"
				+ "She swallowed the dog to catch the cat,");
		cat();
		bird();
		spider();
		fly();
	}
	
	public static void verse6() {
		System.out.println("There was an old lady who swallowed a horse,\n"
				+ "She died of course.");
	}
}
