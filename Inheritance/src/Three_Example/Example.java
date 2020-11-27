package Three_Example;

public class Example {

	static int a =m1();
	static {
		System.out.println("Example SB");
	}
	int x = m2();
	{
		System.out.println("Example NSB");
	}
	public Example() {
		// TODO Auto-generated constructor stub
		System.out.println("Example Constructor");
	}
	static int m1() {
		System.out.println("Example SV is Created");
		return 10;
	}
	int m2() {
		System.out.println("Example NSV is Created");
		return 20;
	}
	void abc() {
		System.out.println("Example abc");
	}
	void bbc() {
		System.out.println("Example bbc");
	}
	
}
