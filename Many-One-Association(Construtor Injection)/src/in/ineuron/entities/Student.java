package in.ineuron.entities;

//Target Object
public class Student {

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

		System.out.println("---------------------------------------");
		System.out.println("Branch details are :: ");
		System.out.println("BID   is :: " + branch.getBid());
		System.out.println("BNAME is :: " + branch.getBloc());

	}

}
