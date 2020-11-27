package Overriding.One;

public class A13 {

	static void m1() {
		System.out.println("A M1");
	}
	void m2() {
		System.out.println("A M2");
		m1();
	}
}
