package studentDatabaseApp;

import java.lang.reflect.Array;
import java.util.Scanner;

public class studentDatabaseApp {

	public static void main(String[] args) {

		
		// Ask how many new students to enroll
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of new students to enroll: ");
		int newStudents = in.nextInt();
		
		Student[] students = new Student[newStudents];
		
		// Create n number of students
		for(int i = 0; i < newStudents; i++) {
			students[i] = new Student();
			students[i].enrollInCourses();
			students[i].payTuition();
			students[i].showInfo();			
		}
	}

}
