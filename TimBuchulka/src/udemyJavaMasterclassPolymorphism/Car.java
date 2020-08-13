package udemyJavaMasterclassPolymorphism;

public class Car {
	private boolean engine;
	private String name;
	private int cylinders;
	private int wheels;
	
	public Car(String name, int cylinders) {
		this.engine = true;
		this.name = name;
		this.cylinders = cylinders;
		this.wheels = 4;
	}
	
	public String startEngine() {
		return "Car -> startEngine()";
	}
	
	public String accelerate() {
		return "Car -> accelerate()";
	}
	
	public String brake() {
		return "Car -> brake()";
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}
}
