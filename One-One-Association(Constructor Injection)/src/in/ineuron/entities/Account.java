package in.ineuron.entities;

//Dependent class
public class Account {

	// instance variables
	private String accNo;
	private String accType;
	private String accName;

	// Performing Constructor Injection
	public Account(String accNo, String accType, String accName) {
		System.out.println("Account:: Constructor");
		this.accNo = accNo;
		this.accType = accType;
		this.accName = accName;
	}

	//Sending the data to the users
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
