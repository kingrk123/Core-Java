package com.nt.Synchronised;

public class Test {

	public static void main(String[] args) {
		Add a = new Add();
		
		new Thread1(a).start();
		new Thread2(a).start();

	}

}
