package Enums;

public class Runner {
	final static String str = "Adi";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double earthWeight = Double.parseDouble("175");
		double mass = earthWeight / Planets.EARTH.surfaceGravity();
		System.out.println(mass);
		for (Planets p : Planets.values()) {
			System.out.printf("your weight on %s is %f%n", p, p.surfaceWeight(mass));
		}
	}

}
