package com.qa.OOPQuestions;

public class MakeInheritance2 extends BrandInheritance {
	
	private String Make = "A Class";

	public String getMake() {
		return Make;
	}	
		public void Description() {
			System.out.println("Manufacturer: " + super.getBrand() + " Make: " + this.getMake() + " Doors: " + this.Doors());	
		}
		int doors = 5;
		@Override
		public int Doors() {
			return doors;
			
		}
	}



