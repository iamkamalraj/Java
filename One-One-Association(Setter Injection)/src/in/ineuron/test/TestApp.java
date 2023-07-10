package in.ineuron.test;

import in.ineuron.entities.Account;
import in.ineuron.entities.Employee;

public class TestApp {

	public static void main(String[] args) {

		// Creating an Dependent object
		Account account = new Account();

		// performing setter injection to inject the values
		account.setAccName("sachin");
		account.setAccNo("ISB-222");
		account.setAccType("current");

		// Create a Target object and inject the dependent object in the constructor
		Employee employee = new Employee();
		employee.setEid(10);
		employee.setEname("sachin");
		employee.setEaddress("IND");

		// Performing Setter injection to account
		employee.setAccount(account);

		// checking the data of employee to see whether injection happened or not
		employee.display();

	}

}
