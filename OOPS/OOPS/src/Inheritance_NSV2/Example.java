package Inheritance_NSV2;

public class Example {
	static int a = m1();
	static{
		System.out.println("Example SB");
	}
	int x = m2();
	{
		System.out.println("Example NSB");
	}
	Example(){
		System.out.println("Example Constructor");
	}
	static int m1() {
		System.out.println("Example SV is created ");
		return 10;
	}
	int m2() {
		System.out.println("Example NSV is created");
	}
	void abc(){
		System.out.println("Example abc");
	}
	void bbc() {
		System.out.println("Example bbc");
	}
}
