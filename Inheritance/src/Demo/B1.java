package Demo;

public class B1 extends A1 {

	static int b = m2();
	static int m2() {
		System.out.println("B SV");
		return 20;
	}
	static {
		System.out.println("B SB");
	}
	public static void main(String[] args) {
		System.out.println("B Main");
		System.out.println("\n B Main a: "+a);
		System.out.println("B Main b: "+b);

	}

}
