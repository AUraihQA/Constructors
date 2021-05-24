package com.qa.OOPQuestions;

public class PolymorphismCow extends PolymorphismAnimal{
	
	public void speak() {
        System.out.println("moo");
        
        
	}

	@Override
	public String toString() {
		return "PolymorphismCow [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	}


