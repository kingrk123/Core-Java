package Overloading1;

import Overloading.Test;

public class Example {

	public static void main(String[] args) {
		Test1 t =new Test1();
		t.m2("durga");
		t.m2(new StringBuffer("durga"));
		//t.m2(null);  //String is ambiguous
	}
}
