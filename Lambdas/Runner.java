package Lambdas;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int age =18;
//		//ternary statment
//		final String msg = age > 10 ? "Thank you" : "ID please";
//		System.out.println(msg);

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);

		// -> this is a lambda, they work with arraylists
		arrayList.forEach(n -> System.out.println(n));
	}

}
