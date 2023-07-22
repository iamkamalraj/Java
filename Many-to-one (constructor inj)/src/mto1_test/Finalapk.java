package mto1_test;

import mto1_entities.Branch;
import mto1_entities.Student;


public class Finalapk {
	
	//Driving Code
	public static void main(String[] args) {
		
		//Creating a dependent object
		Branch branch = new Branch("KAML041120", "RANIPET");
		
		//Creating Target Object
		Student s1= new Student(01, "Poovannan", 48, branch );
		Student s2 = new Student(02, "Sivagami", 44, branch);
		Student s3 = new Student(03,"Kaavya Shree", 24, branch);
		
		s1.getStudentDetails();
		System.out.println();
		
		s2.getStudentDetails();
		System.out.println();
		
		s3.getStudentDetails();
		
		
		

	}

}
