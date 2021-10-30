package dataStructuresAndAlgorithmsInJavaArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("Jane", "Jones", 123));
		employeeList.add(new Employee("John", "Doe", 4567));
		employeeList.add(new Employee("Mary", "Smith", 22));
		employeeList.add(new Employee("Michael", "Wilson", 3245));
		
		
		
		 // Lambda function to print employeeList
//		employeeList.forEach(employee -> System.out.println(employee));
		
//		System.out.println("\n" + employeeList.get(1));
//		System.out.println(employeeList.isEmpty());
		
		// replace existing employee
		employeeList.set(1, new Employee("John", "Adams", 4568));
//		System.out.println("\n" + employeeList.get(1));
		
//		employeeList.forEach(employee -> System.out.println(employee));
		
//		System.out.println(employeeList.size());
		
		employeeList.add(3, new Employee("John", "Doe", 4567));
		System.out.println();
//		employeeList.forEach(employee -> System.out.println(employee));
		System.out.println();

		// get the array from List that holds the Employees
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for(Employee employee : employeeArray) {
			System.out.println(employee);
		}
		
		System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
		System.out.println(employeeList.indexOf(new Employee("Michael", "Wilson", 3245)));
		
		employeeList.remove(2);
		employeeList.forEach(employee -> System.out.println(employee));



		
		

	}
}
