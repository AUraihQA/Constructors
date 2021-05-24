package com.qa.OOPQuestions;

public class MakeInheritance extends BrandInheritance implements CoupeInterface, ColourInterface{
	 
	public String getMake() {
		return Make;
	}

	private String Make = "C Class";
	int doors = 3;
	String shape = "Coupe";
	
	public void Desription() {
		System.out.println("Manufacturer: " + super.getBrand() + " Make: " + this.getMake() + " Doors: " + this.Doors() + " Shape: " + this.shape());
	}
	
	@Override
	public int Doors() {
		return doors;
		
	}
	@Override
	public String shape() {
		return shape;
		
		
	}

	@Override
	public String ColourOfCar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean otherShapes(int myInt) {
		if(myInt == 1) {
			return true;
		} else {
		return false;
	}
	
	}

	
	}


