package com.nt.Deadlock;

public class SecondClass {

	synchronized void seconClassMethod(FirstClass fc) {
		String name = Thread.currentThread().getName();
		System.out.println(name+" is entered into sc.secondClassMethod()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+" is trying to caall fc.lastMethod()");
		fc.lastMethod();
	}
	synchronized void lastMethod() {
		System.out.println("Inside sc.lastMethod()");
	}

}
