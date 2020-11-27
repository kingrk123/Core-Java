package SuperConstructor;

public class Sample extends Example{
	Sample() {
		System.out.println("Sample zero-param");
	}
	Sample (int a){
		super(50);
		System.out.println("sample int-param");
	}

	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample(10);
	}
}
