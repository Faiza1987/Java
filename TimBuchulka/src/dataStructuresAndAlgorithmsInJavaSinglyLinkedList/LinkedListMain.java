package dataStructuresAndAlgorithmsInJavaSinglyLinkedList;

import dataStructuresAndAlgorithmsInJavaSinglyLinkedList.Employee;


public class LinkedListMain {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee michaelWilson = new Employee("Michael", "Wilson", 3245);
		
		EmployeeLinkedList employeeList = new EmployeeLinkedList();

		System.out.println("Size: " + employeeList.getSize());
		System.out.println("Is list empty? " + employeeList.isEmpty()); // true
		
		employeeList.addToFront(janeJones);
		employeeList.addToFront(johnDoe);
		employeeList.addToFront(marySmith);
		employeeList.addToFront(michaelWilson);
		
		System.out.println("Size: " + employeeList.getSize());
		System.out.println("Is list empty? " + employeeList.isEmpty()); // false

		employeeList.printList();
		
		employeeList.removeFromFront();
		System.out.println("\nSize: " + employeeList.getSize());
		employeeList.printList();
	}

}
