package in.ineuron.entities;

//Target Class
public class Department {

	// instance variables
	private Integer deptNo;
	private String deptName;
	private String deptLoc;

	// HAS-A variable
	private Employee[] employees;

	// Performing constructor injection
	public Department(Integer deptNo, String deptName, String deptLoc, Employee[] employees) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLoc = deptLoc;

		// HAS-A variable injection through constructor
		this.employees = employees;
	}

	//rendering the message to the user
	public void display() {
		System.out.println("**************DEPARTMENT DETAILS************************");
		System.out.println("DEPTNO    IS    :: " + deptNo);
		System.out.println("DEPTNAME  IS    :: " + deptName);
		System.out.println("DEPTLOC   IS    :: " + deptLoc);

		System.out.println("***********************************************************");
		System.out.println("*************EMPLOYEE DETAILS******************************");

		for (Employee employee : employees) {
			System.out.println("EID    IS    :: " + employee.getId());
			System.out.println("ENAME  IS    :: " + employee.getEname());
			System.out.println();
		}

	}

}
