package Super.One;

public class Sample extends Example {
	public Sample() {
		// TODO Auto-generated constructor stub
		System.out.println("Sample Zero-param");
	}
	Sample(int a){
		System.out.println("Sample int-Param");
	}
	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample(10);
		
	}
}
