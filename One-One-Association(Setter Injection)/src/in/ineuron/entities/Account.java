package in.ineuron.entities;

//Dependent class
public class Account {

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
