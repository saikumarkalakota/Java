package com.sai.javabasics;

public class ClassMembersDefault {
	  static int intVal;
	  static double doubleVal;
	  

	public static void main(String[] args) {		
		System.out.println("Default value of Class member variable intVal is " + intVal);
		System.out.println("Default value of Class member  variable is " + doubleVal);
		
		/* We cannot call this printDefaultValues() directly from the static main method 
		as there is no object reference created yet. */
	      //printDefaultValues();
		
		//Hence, create an instance/object (using 'new' keyword) of main class ClassMembersDefault 
		ClassMembersDefault objCMD=new ClassMembersDefault();
		
		//Now, call the non-static method using created instance # objCMD
		objCMD.printDefaultValues();
		
		// Efficient way of creating & calling the non-static method using ClassName().Non-StaticMethod name
		
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
