package EmailAdministrationApplication;

// Generate an email with following syntax: firstname.lastname@department.company.com
// Determine the department (sales, development, accounting). If none, leave blank
// Generate a random String for a password
// Have set methods to change the password, set the mailbox capacity, and define an alternate email address
// Have getters and setters to display the name, email and mailbox capacity

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");
		System.out.println(em1.showInfo());
	}

}
