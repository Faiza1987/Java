package emailAdministrationApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private String companySuffix = "mycompany.com";
	private int defaultMailboxCapacity = 1000;
	private int defaultPasswordLength = 8;
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
				
		// call method to set department
		this.department = setDepartment();
		
		// call method to generate random password
		this.password = randomPassword(this.defaultPasswordLength);
		
		// call elements to generate email
		this.email = firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + "." + this.companySuffix;
	}
	
	// METHODS
	
	// ask for Department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Developemnt\n3 for Accounting\n0 for None\nEnter Department Code");
		
		Scanner input = new Scanner(System.in);
		int depChoice = input.nextInt();
		
		if(depChoice == 1) { 
			return "Sales"; 
		} else if (depChoice == 2) { 
			return "Development"; 
		} else if (depChoice == 3) { 
			return "Accounting" ; 
		} else {
			return "" ; 
		}
		
	}
	// generate random password
	private String randomPassword(int length) {
		String passwordSet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZx0123456789!@#$%^&*()_+=?><";
		
		char[] password = new char[length];
		
		int rand = 0;
		for(int i = 0; i < length; i++) {
			rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//show info
	public String showInfo() {
		return ("DISPLAY NAME: " + this.firstName + " " + this.lastName + 
				"\nCOMPANY EMAIL: " + this.email + 
				"\nMAILBOX CAPACITY: " + defaultMailboxCapacity + " mb");				
	}
	
	// GETTERS
	// get mailbox capacity
	public int getDefaultMailboxCapacity() {
		return defaultMailboxCapacity;
	}
	// get alternate email
	public String getAlternateEmail() {
		return alternateEmail;
	}
	// get password
	public String getPassword() {
		return password;
	}
	
	// SETTERS
	// set mailBox capacity
	public void setMailboxCapacity(int capacity) {
		this.defaultMailboxCapacity = capacity;
	}
	public void setDefaultMailboxCapacity(int defaultMailboxCapacity) {
		this.defaultMailboxCapacity = defaultMailboxCapacity;
	}
	// set alternate email address
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	//change password
	public void setPassword(String password) {
		this.password = password;
	}
	
}
