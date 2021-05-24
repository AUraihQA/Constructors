package Scanner;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("First Number");
		String num1 = sc.nextLine();
		System.out.println("Second Number");
		String num2 = sc.nextLine();
		
		Details addCalc = new Details();
		System.out.println("Division: " + Details.divTwo(num1, num2));
//		System.out.println("Addition: " + Details.addTwo(num1, num2));
//		System.out.println("Subtraction: " + Details.subTwo(num1, num2));
//		System.out.println("Multiplicatio: " + Details.multTwo(num1, num2));
		
	}

}
