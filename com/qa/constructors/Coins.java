package com.qa.constructors;

public class Coins {
	public static void Change(double Price, double Payment) {
		double a = Payment - Price;
		int b10 = 0;
		int c5 = 0;
		int d20 = 0;
		int e2 = 0;
		System.out.println("Change " + a);
		while(a>=10) {
			a -=10;
			b10++;
		}System.out.println(b10 + ": £10 note");
		while(a>=5) {
			a -=5;
			c5++;
		}System.out.println(c5 + ": £5 note");
		while(a>=0.20) {
			a -=0.20;
			d20++;
		}System.out.println(d20 + ": 20 pence");
		while(a>=0.019) {
			a -=0.02;
			e2++;
			System.out.println(e2 + ": 2 pence");
	}
}
}


