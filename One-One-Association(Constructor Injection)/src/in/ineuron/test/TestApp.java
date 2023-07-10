package in.ineuron.test;

import in.ineuron.entities.Account;
import in.ineuron.entities.Employee;

public class TestApp {

	public static void main(String[] args) {

		// Creating an Dependent object through constructor
		Account account = new Account("ISB-1111", "savings", "sachin");

		// Create a Target object and inject the dependent object in the constructor
		Employee employee = new Employee(10, "sachin", "MI", account);

		// checking the data of employee to see whether injection happened or not
		employee.display();

	}

}
