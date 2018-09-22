package ParametersAndObjects;
import java.util.Scanner;


public class TheNameGame {
	public static void main(String[] args) {
		
		//Take user input of name
		//Save name in a variable of type String
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter fullname:");
		String name = input.nextLine();
		input.close();
		
		//find the index of the space between first and last names
		int spaceIndex = name.indexOf(" ");
		//Gives the value from index 0 until spaceIndex 
		String firstName = name.substring(0, spaceIndex);
		//Gives the value from spaceIndex + 1 until the last index of lastName
		String lastName = name.substring(spaceIndex + 1);
		
		
		theNameSong(firstName);
		theNameSong(lastName);
	}
		
	//Prints the NameGame song 
	public static void theNameSong(String name) {
		System.out.println();
		//Prints all letters of the first and last names EXCEPT the first letters
		String allButFirstLetter = name.substring(1);
		System.out.println(name + " " + name + ", bo-B" + allButFirstLetter);
		System.out.println("Banana-fana fo-F" + allButFirstLetter);
		System.out.println("Fee-fi-mo-M" + allButFirstLetter);
		System.out.println(name.toUpperCase() + "!");
	}
}	
