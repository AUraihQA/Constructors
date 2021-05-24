package Hashes;

import java.util.HashMap;
import java.util.HashSet;

public class Runner {

	public static void main(String[] args) {
		//Hashsets example
//		HashSet<String> cars = new HashSet<String>();
//		cars.add("Audi");
//		cars.add("BMW");
//		cars.add("Merc");
//		cars.add("Honda");
//		System.out.println(cars);
//		
//		cars.forEach(x -> System.out.println(x));
//		System.out.println(cars.contains("Audi"));
		
		HashMap<Integer, String> cars = new HashMap<Integer, String>();
		cars.put(1 , "Audi S7");
		cars.put(2 , "BMW M5");
		System.out.println(cars);
		for (Integer i : cars.keySet()) {
			System.out.println(i);
		} 
		for (String i : cars.values()) {
			System.out.println(i);
		}
		for (Integer i : cars.keySet()) {
			System.out.println("Key is: " + "Value is: " + cars.get(i));
		}

	}

}
