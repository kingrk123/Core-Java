package Overriding.Two;

public class Sample extends Example {

	static void m1() {
		System.out.println("Sample m1");
	}
	void m2() {
		System.out.println("Sample m2");
	}
	void m4(String s) {
		System.out.println("Sample m4");
	}
	public static void main(String[] args) {
		Sample s = new Sample();
		s.m1();
		s.m2();
		s.m3();
		s.m4();
		s.m4("HK");
		
		Example e = new Sample();
		e.m1();
		e.m2();
		e.m3();
		e.m4();

	}

}
