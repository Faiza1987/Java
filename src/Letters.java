
public class Letters {
	public static void main(String[] args) {
		salutation("Ahsan");
		System.out.println();
		introduction();
		System.out.println();
		conclusion();
		System.out.println();
		ending();
	}
	
	public static void salutation(String name) {
		System.out.println("My dear " + name);
	}
	
	public static void introduction() {
		System.out.println("How have you been? I am doing well. I have finally found something that I quite enjoy doing\n" 
	+ "but, unfortunately, I am not as good at it as I would like to be. Funrthermore, I am a slow learner.\n" 
	+ "I am committed though and I will continue to learn and understand well the concepts of programming and "
	+ "re-learn\n"
	+ "mathematics from the beginning.");
	}
	
	public static void conclusion() {
		System.out.println("But enough about me. Please give me news of your activities. How has everything been with you?\n"
				+ "Any new developments in your life? Please write soon and more often!");
	}
	
	public static void ending() {
		System.out.println("Love, Faiza");
	}
}
