package Inheritance_NSV2;

public class sample extends Example{
	static int b = m3();
	static {
		System.out.println("Sample SB");
	}
	int y = m4();
	{
		System.out.println("sample NSB");
	}
	
	sample(){
		System.out.println("sample constructor");
	}
	static int m3() {
		System.out.println("Sample SV is created");
		return 30;
	}
	int m4() {
		System.out.println("Sample NSV is created");
		return 40;
	}
	void abc() {
		System.out.println("Sample abc");
	}
	public static void main(String[] args) {
		System.out.println("sample main");
		sample s = new sample();
		s.abc();
		s.bbc();
	}
}
