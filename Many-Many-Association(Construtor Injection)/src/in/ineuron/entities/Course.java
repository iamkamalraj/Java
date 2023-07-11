package in.ineuron.entities;

//Dependent Object
public class Course {

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
