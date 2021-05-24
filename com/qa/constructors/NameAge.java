package com.qa.constructors;

public class NameAge {
	// Attribute - DNA
	String FirstName;
	String SecondName;
	int age;

	// Constructor - is the blue print of a project;

	public NameAge(String FN, String SN, int age) {
		FirstName = FN;
		SecondName = SN;
		this.age = age;
		
	}
	
	public NameAge (String FN, String SN) {
		FirstName = FN;
		SecondName = SN;
	}

	@Override
	public String toString() {
		return "My name is " + FirstName + " " + SecondName + " I am " + age + " years old";
	} 

}
