package com.sai.javabasics;

import java.util.logging.Logger;

public class Student {
	int studentId;
	String studentName="John King";
	double studentFee=1000.0;
	
	Logger log=Loggerfactory(Student.class);

	void fetchStudentDetails() {
		int studentRollNumber;// ='a';

		try {
			studentRollNumber = 1;
			studentRollNumber++;
			//studentId = studentRollNumber / 0;// Should throw exception
			System.out.println("Student Roll Number in integer type is :" + studentRollNumber);
			studentRollNumber = 'd';
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			studentRollNumber = 'a';
		}
		System.out.println("Default value of uninitialized Class variable- student id is: " + studentId);
		System.out.println("Student Roll Number in ASCII val of alphabet is " + studentRollNumber);
	}

	private Logger Loggerfactory(Class<Student> class1) {
		// TODO Auto-generated method stub
		Logger log=null;
		return log;
	}

	void getStudentDetails() {
		
		System.out.println("Student name is "+studentName);
		System.out.println("Student Fee is "+studentFee);
		
		//log.info("Student name is "+studentName);
//		log.info("Student Fee is "+studentFee);
		

	}

}
