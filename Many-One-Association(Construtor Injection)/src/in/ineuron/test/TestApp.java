package in.ineuron.test;

import in.ineuron.entities.Branch;
import in.ineuron.entities.Student;

//It refers to relationship b/w entites, where mulitple instance of one entity should be mapped to
//one instance of another entity.
//eg: Multiple student have joined with single branch

	
public class TestApp {

	// Driving code
	public static void main(String[] args) {

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

	}

}


******************************************OUTPUT**********************************************

	
