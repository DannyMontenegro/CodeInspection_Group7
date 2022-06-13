package labcodeinspection;

import java.util.Locale;

public class Email {

	String m_firstName; 
	String m_lastName;
	private String password;
	private String department;
	private int defaultpasswordLength = 8;
	private String email;
	
	
	/**
	 * Default constructor 
	 * @param firstName 
	 * @param lastName
	 */
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}
	
	/**
	 * Method to get first name
	 * @return
	 */

	public String getM_firstName() {
		return m_firstName;
	}

	/**
	 * Method to set first name
	 * @param m_firstName
	 */
	public void setM_firstName(String m_firstName) {
		this.m_firstName = m_firstName;
	}
	
	/**
	 * Method to get LastName
	 * @return
	 */
	public String getM_lastName() {
		return m_lastName;
	}

	/**
	 * Method to set Last name
	 * @param m_lastName
	 */
	public void setM_lastName(String m_lastName) {
		this.m_lastName = m_lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getDefaultpasswordLength() {
		return defaultpasswordLength;
	}

	public void setDefaultpasswordLength(int defaultpasswordLength) {
		this.defaultpasswordLength = defaultpasswordLength;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Method used to show information
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	/**
	 * Method used to set Department
	 * @param depChoice
	 */
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	
	/**
	 * Method to generate Email
	 */

	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase(Locale.US) + this.m_lastName.toLowerCase(Locale.US) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
