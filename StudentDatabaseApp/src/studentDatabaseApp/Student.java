package studentDatabaseApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Student {
	
	private static final int DEFAULT_ID_LENGTH = 5;
	private static final double COST_OF_COURSE = 600.00;
	private static int STUDENT_ID = 1000;

	private String studentId;
	private String firstName;
	private String lastName;
	private int year;
	private Set<String> coursesEnrolled = new HashSet<>();
	private double tuitionBalance = 0;
	private enum CoursesAvailable {HISTORY_101, COMPUTER_SCIENCE_101, MATHEMATICS_101, CHEMISTRY_101, BIOLOGY_101, PHYSICS_101};
	
	// Constructor: prompt student to enter student's name and year
	public Student() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter student's First Name: ");
		this.firstName = input.nextLine();
		
		System.out.println("Please enter student's Last Name: ");
		this.lastName = input.nextLine();
		
		System.out.println("Please enter student's Year:\n1 for Freshman\n2 for Sophomore\n3 for Junior\n4 for Senior");
		this.year = input.nextInt();
				
		setStudentId();
//		System.out.println("\n" + firstName + " " + lastName + " " + year + " " + studentId);
	}
	// Set student Id
	private void setStudentId() {
		// Grade level + ID
		STUDENT_ID++;
		this.studentId = this.year + "" + STUDENT_ID;
	}
	// Enroll in courses
	public void enrollInCourses() {
		System.out.println("Courses Available: " + java.util.Arrays.asList(CoursesAvailable.values()));
		
		Scanner in = new Scanner(System.in);
		String course = null;
		do {			
			System.out.println("Enter course to enroll in (Q to quit): ");
			course = in.nextLine();
			
			if(!course.equalsIgnoreCase("q")) {				
				coursesEnrolled.add(course);
			}
					
		} while (!course.equalsIgnoreCase("q"));
		
		this.tuitionBalance = (COST_OF_COURSE * coursesEnrolled.size());  
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: " + this.tuitionBalance);
	}
	// Pay Tuition
	public void payTuition() {
		Scanner in = new Scanner(System.in);
		System.out.println("How much would you like to pay? $");
		double payment = in.nextDouble();
		
		this.tuitionBalance -= payment;
		
		System.out.println("Thank you for your payment of: $" + payment);
		viewBalance();
	}
	// Show Status
	public void showInfo() {
		System.out.println("Student id: " + this.studentId
				+ "\nYear: " + this.year 
				+ "\nName: " + this.firstName + " " + this.lastName 
				+ "\n Courses enrolled in: " + this.coursesEnrolled 
				+ "\nRemaining Balance: " + this.tuitionBalance) ;
	}
}
