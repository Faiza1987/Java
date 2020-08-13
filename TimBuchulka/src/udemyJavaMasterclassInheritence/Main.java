package udemyJavaMasterclassInheritence;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		
		Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");
		
//		dog.eat();
//		dog.walk();
//		dog.run();

		Fish fish = new Fish("Orca", 20, 1000, 12, 2, 3);
		
		fish.swim(40);
		
	}

}
