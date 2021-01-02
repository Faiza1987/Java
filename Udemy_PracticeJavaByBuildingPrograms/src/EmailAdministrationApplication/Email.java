package EmailAdministrationApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 8;
	private String companySuffix = "company.com";
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// call method asking for department - return department
		this.department = setDepartment();
		
		// call method that returns random password
		this.password = generateRandomPassword(this.defaultPasswordLength);
		
		// combine elements to generate email
		this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + "." + this.companySuffix;
	}
	
//	// Ask for department
//	private String setDepartment() {
//		Scanner console = new Scanner(System.in);
//		System.out.println("DEPARTMENT CODES:\n"
//				+ "1 for Sales\n"
//				+ "2 for Development\n"
//				+ "3 for Accounting\n"
//				+ "0 for None\n"
//				+ "Enter department code.");
//		
//		int choice = console.nextInt();
//	
//		switch(choice) {
//			case 0: return "None";
//			case 1: return "Sales";
//			case 2: return "Development";
//			case 3: return "Accounting";
//			default: return "Make a selection";
//		}
//
//	}
	
	private int selectDeptCode() {
		Scanner console = new Scanner(System.in);
		System.out.println("DEPARTMENT CODES:\n"
		+ "1 for Sales\n"
		+ "2 for Development\n"
		+ "3 for Accounting\n"
		+ "4 for None\n"
		+ "Enter department code.");
		
		int choice = console.nextInt();
		return choice;
	
	}
	private String setDepartment() {
		int choice = 0;
		
		do {
		
			choice = selectDeptCode();
		
		} while (choice < 1 || choice > 4);
		
		System.out.println(choice);
		
		switch(choice) {
			case 1: return "Sales";
			case 2: return "Development";
			case 3: return "Accounting";
			case 4: return "None";
			default: return "Make a selection";
		}
	}
	
	// Generate a random password
	private String generateRandomPassword(int length) {
		String passwordSet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890!@#$%^&*()_+=?><}{';.,";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int randomNumber = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(randomNumber);
		}
		return new String(password);
	}
	// set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// set the alternate email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	// change password
	public void setNewPassword(String password) {
		this.password = generateRandomPassword(this.defaultPasswordLength);
	}
	
	public int getMailboxCapacity() {
		return this.mailboxCapacity;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getAlternateEmail() {
		return this.alternateEmail;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	
	public String showInfo() {
		return "Display Name: " + getName() + "\n"
				+ "Email: " + getEmail() + "\n"
						+ "Mailbox Capacity: " + getMailboxCapacity();
	}
}
