package com.sai.javabasics;

public class ClassMembersDefault {
	  static int intVal;
	  static double doubleVal;
	  

	public static void main(String[] args) {		
		System.out.println("Default value of Class member variable intVal is " + intVal);
		System.out.println("Default value of Class member  variable is " + doubleVal);
		
		// can't do this from this static method, no object reference
	    // printDefaultValues();
		//create instance of class ClassMembersDefault
		ClassMembersDefault objCMD=new ClassMembersDefault();
		
		//call the non-static method using created instance -objCMD
		objCMD.printDefaultValues();
		
		new ClassMembersDefault().printDefaultValues();

		
		//or call define another static method & call using Class name ClassMembersDefault
		ClassMembersDefault.printDefaultValuesStatic();
		
	}

	public void printDefaultValues() {
		int intInstanceVar=0;
		System.out.println("DefaultValue of Class variable intVal called from main method using instance method of is " 
		+ intVal);
		System.out.println("Default value of intVal is " + doubleVal);
		intVal--;
		System.out.println("Post decrement value of intVal is " + intVal);	
		System.out.println("Value of local variable intInstanceVar is " 
				+ intInstanceVar);
	}
	
	public static void printDefaultValuesStatic() {
		System.out.println("Value of Class variable intVal called from main method using static method of is " + intVal);
		System.out.println("Default value of intVal is " + doubleVal);
		intVal++;
		System.out.println("Post increment the value of Class variable intVal is " + intVal);	
	}
	

	
}
