package Overloading1;

public class Test1 {
	public void m2(String s) {
		System.out.println("String arg");
	}
	public void m2(StringBuffer sb) {
		System.out.println("Buffer arg");
	}
}
