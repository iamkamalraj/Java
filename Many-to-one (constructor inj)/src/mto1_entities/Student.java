package mto1_entities;

public class Student {
	 
	private int sid;
	private String sname;
	private int sage;
	
	//Has-A Variable
	private Branch branch;
	
	//Constructor Injection
	public Student(int sid, String sname, int sage, Branch branch) {
		
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.branch = branch;
	}
	
	public void getStudentDetails() {
	
		System.out.println("************Student Details are*******");
		System.out.println("Student ID is :: " + sid);
		System.out.println("Student Name is :: " + sname);
		System.out.println("Student Age is :: " + sage );
		
		System.out.println("***********Branch Details are************");
		System.out.println("Branch IFSC is :: " + branch.getBifsc() );
		System.out.println("Branch Location is :: " + branch.getBloc());
		
		
	}
	
}
