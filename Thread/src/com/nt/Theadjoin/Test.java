package com.nt.Theadjoin;

public class Test {

	public static void main(String[] args) {
		Runner1 t1 = new Runner1();
		Runner2 t2 = new Runner2();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Runner1 Finished.................... ");
	}

}
