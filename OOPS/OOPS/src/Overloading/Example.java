package Overloading;

public class Example {

	public static void main(String[] args) {
		Test t =new Test();
		t.m1(10);
		t.m1(10.5f);
		
		t.m1('c');
		t.m1(10L);
		//t.m1(10.5);//error
	}
}
