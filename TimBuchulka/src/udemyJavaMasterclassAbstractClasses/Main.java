package udemyJavaMasterclassAbstractClasses;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Yorkie");
		dog.breathe();
		dog.eat();
        System.out.println();
		Owl owl = new Owl("Snow Owl");
		owl.breathe();
		owl.eat();
		owl.fly();
        System.out.println();
        Penguin penguin = new Penguin("Emperor");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
	}

}
