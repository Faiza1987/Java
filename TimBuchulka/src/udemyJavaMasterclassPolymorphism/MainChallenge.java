package udemyJavaMasterclassPolymorphism;

public class MainChallenge {
	
	public static void main(String[] args) {
		Car car = new Car("Base Car", 8);
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		System.out.println("================================");
		Mitsubishi mitsubishi = new Mitsubishi("Outlander VRX 4WD", 6);
		System.out.println("Name: " + mitsubishi.getName());
		System.out.println("Cylinders: " + mitsubishi.getCylinders());
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());
		System.out.println("================================");
		Ford ford = new Ford("Ford Falcon", 6);
		System.out.println("Name: " + ford.getName());
		System.out.println("Cylinders: " + ford.getCylinders());
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
		System.out.println("================================");
		Holden holden = new Holden("Holden Commodore", 8);
		System.out.println("Name: " + holden.getName());
		System.out.println("Cylinders: " + holden.getCylinders());
		System.out.println(holden.startEngine());
		System.out.println(holden.accelerate());
		System.out.println(holden.brake());
	}
}
