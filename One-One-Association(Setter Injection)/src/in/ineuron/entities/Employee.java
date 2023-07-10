package in.ineuron.entities;

//Target Class
public class Employee {

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
