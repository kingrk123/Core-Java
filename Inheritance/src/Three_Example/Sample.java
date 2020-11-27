package Three_Example;

public class Sample extends Example{

	static int b = m3();
	static {
		System.out.println("Sample SB");
	}
	int y  = m4();
	{
		System.out.println("Sample NSB");
	}
	public Sample() {
		// TODO Auto-generated constructor stub
		System.out.println("Sample Constructor");
	}
	static int m3() {
		System.out.println("Sample SV is Created");
		return 30;
	}
	int m4() {
		System.out.println("Sample NSV is Creted");
		return 40;
	}
	void abc() {
		System.out.println("Sample ABC");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sample Main");
		Sample s = new Sample();
		s.abc();
		s.bbc();
	}

}
