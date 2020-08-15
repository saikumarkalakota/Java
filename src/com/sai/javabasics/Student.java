package com.sai.javabasics;

public class Student {
	int studentId;
	
void fetchStudentDetails() {
	int  studentRollNumber;//='a';
	
	try {
		studentRollNumber=1;
		studentRollNumber++;
		studentId=studentRollNumber/0;//Should throw exception
		System.out.println("Student Roll Number in integer type is :"+ studentRollNumber);
		studentRollNumber='d';
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		studentRollNumber='a';
	}
	System.out.println("Default value of uninitialized Class variable- student id is: " +studentId);
	System.out.println("Student Roll Number in ASCII val of alphabet is "+ studentRollNumber);
}
	

}
