package Chapter5ProgramLogicAndIndefiniteLoops;

/* Using "Boolean Zen," write an improved version of the following method, which returns whether the given number of cents would require any pennies (as opposed to being an amount that could be made exactly using coins other than pennies): (In other words, remove unnecessary logical tests and remove if/else statements that test the value of a boolean variable.) */

public class hasPenniesSC19 {
	public static void main(String[] args) {
		System.out.println(hasPennies(2978));
	}
	
	public static boolean hasPennies(int cents) {
		
		//Boolean Zen
		boolean nickelsOnly = (!(cents % 5 == 0));
		return nickelsOnly;
		
//		boolean nicklesOnly = (cents % 5 == 0);
//		if(nicklesOnly == true) {
//			return false;
//		} else {
//			return true;
//		}
	}
}
