package Demo;

public class A1 {

	static int a =m1();
	static int m1() {
		System.out.println("A SV");
		return 10;
	}
	static {
		System.out.println("A SB");
	}
	public static void main(String[] args) {
		System.out.println("A MAin");

	}

}
