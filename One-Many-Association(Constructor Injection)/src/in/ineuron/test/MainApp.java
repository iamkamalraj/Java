package in.ineuron.test;

import in.ineuron.entities.Department;
import in.ineuron.entities.Employee;

public class MainApp {

	public static void main(String[] args) {

		// Creating an Dependent Object using Constructor injection
		Employee emp1 = new Employee(10, "sachin");
		Employee emp2 = new Employee(18, "kohli");
		Employee emp3 = new Employee(45, "rohith");

		// Creating an Array to perform One-Many Association
		Employee[] employees = new Employee[3];
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;

		// Creating an Target Object using Constructor Injection
		Department department = new Department(123, "BCCI", "Dubai", employees);
		department.display();

	}

}
