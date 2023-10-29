package OOPS;

//relationship
//1.IS-A relationship is used for  inheritance
//2.HAS-A relationship is used for association
//Dependency Injection - injecting the dependent object into target object
//ex: dependent - address(city/pin/dooNO)
//	  target    - Student(name/rollNo/address)
//dependency injection is of two types
//1.constructor injection 2.setter injection
//we can in 4manners
//Aggregation and Composition

//one-one-Association(Setter Injection)
class Employee {

	// instance variables
	private Integer eid;
	private String ename;
	private String eaddress;

	// HAS-A variable injection
	private Account account; 

	
	//setters are used to perform setter injection
	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	// code for displaying the data of Employee
	public void display() {
		System.out.println("Employee:: display method called");
		System.out.println("*************EMPLOYEE DETAILS ARE****************");
		System.out.println("EID    is  :: " + eid);
		System.out.println("ENAME  is  :: " + ename);
		System.out.println("EADDR  is  :: " + eaddress);
		System.out.println("**************ACCOUNT DETAILS ARE*****************");
		System.out.println("ACCNO   is  ::" + account.getAccNo());
		System.out.println("ACCTYPE is  ::" + account.getAccType());
		System.out.println("ACCNAME is  ::" + account.getAccName());

	}

}
class Account {

	// instance variables
	private String accNo;
	private String accType;
	private String accName;

	// setters are used to perform setter injection
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	// Sending the data to the users through getters
	public String getAccNo() {
		return accNo;
	}

	public String getAccType() {
		return accType;
	}

	public String getAccName() {
		return accName;
	}

}

//-----------------------------------------------------------------------------------------------------------------------------------

//one-one-Association(Constructor Injection)
class Employee1 {

	// instance variables
	private Integer eid1;
	private String ename1;
	private String eaddress1;

	// HAS-A variable injection
	private Account1 account1;

	// Performing constructor Injection(alt+shift+s,o)
	public Employee1(Integer eid1, String ename1, String eaddress1, Account1 account1) {
		this.eid1 = eid1;
		this.ename1 = ename1;
		this.eaddress1 = eaddress1;
		this.account1 = account1;
	}

	// code for displaying the data of Employee
	public void display1() {
		System.out.println("Employee:: display method called");
		System.out.println("*************EMPLOYEE DETAILS ARE****************");
		System.out.println("EID    is  :: " + eid1);
		System.out.println("ENAME  is  :: " + ename1);
		System.out.println("EADDR  is  :: " + eaddress1);
		System.out.println("**************ACCOUNT DETAILS ARE*****************");
		System.out.println("ACCNO   is  ::" + account1.getAccNo1());
		System.out.println("ACCTYPE is  ::" + account1.getAccType1());
		System.out.println("ACCNAME is  ::" + account1.getAccName1());

	}

}
class Account1 {

	// instance variables
	private String accNo1;
	private String accType1;
	private String accName1;

	// Performing Constructor Injection
	public Account1(String accNo1, String accType1, String accName1) {
		this.accNo1 = accNo1;
		this.accType1 = accType1;
		this.accName1 = accName1;
	}

	//Sending the data to the users
	public String getAccNo1() {
		return accNo1;
	}

	public String getAccType1() {
		return accType1;
	}

	public String getAccName1() {
		return accName1;
	}

}

//--------------------------------------------------------------------------------------------------------------------------------
//one-many-Association(Constructor Injection)
class Department {

	// instance variables
	private Integer deptNo;
	private String deptName;
	private String deptLoc;

	// HAS-A variable
	private Employee2[] employees2;

	// Performing constructor injection
	public Department(Integer deptNo, String deptName, String deptLoc, Employee2[] employees2) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLoc = deptLoc;

		// HAS-A variable injection through constructor
		this.employees2 = employees2;
	}

	//rendering the message to the user
	public void display() {
		System.out.println("**************DEPARTMENT DETAILS************************");
		System.out.println("DEPTNO    IS    :: " + deptNo);
		System.out.println("DEPTNAME  IS    :: " + deptName);
		System.out.println("DEPTLOC   IS    :: " + deptLoc);

		System.out.println("***********************************************************");
		System.out.println("*************EMPLOYEE DETAILS******************************");

		for (Employee2 employee2 : employees2) {
			System.out.println("EID    IS    :: " + employee2.getId2());
			System.out.println("ENAME  IS    :: " + employee2.getEname2());
			System.out.println();
		}

	}

}

class Employee2 {
	
	//instance variables
	private Integer id;
	private String ename;

	// Constructor injection
	public Employee2(Integer id, String ename) {
		this.id = id;
		this.ename = ename;
	}

	
	//getters to get the value
	public Integer getId2() {
		return id;
	}

	public String getEname2() {
		return ename;
	}

}

//----------------------------------------------------------------------------------------------------------------------------------

//many-one-Association(Constructor Injection)
//Target Object
class Student {

	private Integer sid;
	private String sname;
	private Integer sage;

	// HAS-A variable
	private Branch branch;

	// Constructor Injection
	public Student(Integer sid, String sname, Integer sage, Branch branch) {
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.branch = branch;
	}
	public void getStudentDetails() {
		System.out.println("Student details are :: ");
		System.out.println("SID is   :: " + sid);
		System.out.println("SNAME is :: " + sname);
		System.out.println("SAGE  is :: " + sage);

		System.out.println("************************************");
		System.out.println("Branch details are :: ");
		System.out.println("BID   is :: " + branch.getBid());
		System.out.println("BNAME is :: " + branch.getBloc());
	}
}

//Dependent object
class Branch {
	private String bid;
	private String bloc;

	// Constructor injection
	public Branch(String bid, String bloc) {
		this.bid = bid;
		this.bloc = bloc;
	}

	//Getters to get the value
	public String getBid() {
		return bid;
	}

	public String getBloc() {
		return bloc;
	}
}

//---------------------------------------------------------------------------------------------------------------------------------
//many-many-Association(Constructor Injection)

//Target Object
class Student1 {

	private Integer sid;
	private String sname;
	private Integer sage;

	// HAS-A variable
	private Course[] courses;

	// Constructor injection
	public Student1(Integer sid, String sname, Integer sage, Course[] courses) {
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.courses = courses;
	}

	public void getStudentDetails() {
		System.out.println("Student details are :: ");
		System.out.println("SID is   :: " + sid);
		System.out.println("SNAME is :: " + sname);
		System.out.println("SAGE  is :: " + sage);

		System.out.println("*************************************");
		
		
		System.out.println("Course details are :: ");
		
		//Performing data navigation to access course details
		for (Course course : courses) {
			System.out.println("CID   is :: " + course.getCid());
			System.out.println("CNAME is :: " + course.getCname());
			System.out.println("COST  is :: " + course.getCost());
		}

	}

}

//Dependent Object
class Course {

	private String cid;
	private String cname;
	private Integer cost;

	// Constructor injection
	public Course(String cid, String cname, Integer cost) {
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
	}

	//Getters to send the data
	public String getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public Integer getCost() {
		return cost;
	}

}

//-----------------------------------------------------------------------
//Main Method

public class Association11 {
	public static void main(String args[]) {
		// Creating an Dependent object
		Account account = new Account();
		// Create a Target object and inject the dependent object in the constructor
		Employee employee = new Employee();
		employee.setEid(10);
		employee.setEname("sachin");
		employee.setEaddress("IND");
				
		// performing setter injection to inject the values
		account.setAccName("sachin");
		account.setAccNo("ISB-222");
		account.setAccType("current");	

		
		// Performing Setter injection to account
		employee.setAccount(account);

		// checking the data of employee to see whether injection happened or not
		employee.display();
		
		System.out.println("------------------------------------------------------------------------");
		
		//-----------------------------------------------------------------------------
		
		// Creating an Dependent object through constructor
		Account1 account1 = new Account1("ISB-1111", "savings", "sachin");

		// Create a Target object and inject the dependent object in the constructor
		Employee1 employee1 = new Employee1(10, "sachin", "MI", account1);

		// checking the data of employee to see whether injection happened or not
		employee.display();
		
		System.out.println("-------------------------------------------------------------------------");
		
		//--------------------------------------------------------------------------------------

		// Creating an Dependent Object using Constructor injection
		Employee2 emp1 = new Employee2(10, "sachin");
		Employee2 emp2 = new Employee2(18, "kohli");
		Employee2 emp3 = new Employee2(45, "rohith");

		// Creating an Array to perform One-Many Association
		Employee2[] employees2 = new Employee2[3];
		employees2[0] = emp1;
		employees2[1] = emp2;
		employees2[2] = emp3;

		// Creating an Target Object using Constructor Injection
		Department department = new Department(123, "BCCI", "Dubai", employees2);
		department.display();
		
		System.out.println("-------------------------------------------------------------------------");
		
		//-----------------------------------------------------------------------------------------
		
		// Creating a dependent object
		Branch branch = new Branch("IN01", "VJYNGR");

		// Creating a target object
		Student s1 = new Student(10, "sachin", 49, branch);
		Student s2 = new Student(7, "dhoni", 41, branch);
		Student s3 = new Student(18, "kohli", 35, branch);

		s1.getStudentDetails();
		System.out.println();
		
		s2.getStudentDetails();
		System.out.println();
		
		s3.getStudentDetails();
		
		System.out.println("-------------------------------------------------------------------------");
		
		//--------------------------------------------------------------------------------------------
		
		// Create a Dependent Object
		Course c1 = new Course("INJava", "Java", 500);
		Course c2 = new Course("INPython", "Python", 1000);
		Course c3 = new Course("INJS", "JavaScript", 1500);

		// Creating an Array to perform Many Association to the Target Object
		Course[] courses1 = new Course[2];
		courses1[0] = c1;
		courses1[1] = c3;

		Course[] courses2 = new Course[2];
		courses2[0] = c2;
		courses2[1] = c3;

		Course[] courses3 = new Course[3];
		courses3[0] = c1;
		courses3[1] = c2;
		courses3[2] = c3;

		// Creating an Target object to hold many Courses
		Student1 s11 = new Student1(10, "sachin", 49, courses1);
		Student1 s12 = new Student1(7, "dhoni", 41, courses2);
		Student1 s13 = new Student1(18, "kohli", 35, courses3);

		s11.getStudentDetails();
		System.out.println();

		s12.getStudentDetails();
		System.out.println();

		s13.getStudentDetails();
		System.out.println();
		
		System.out.println("-------------------------------------------------------------------------");



	}
}
