package com.nt.Deadlock;

public class FirstClass {

	synchronized void firstClassMethod(SecondClass sc) {
		String name = Thread.currentThread().getName();
		System.out.println(name+" Entered into FC.firstClassMethod()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+" is trying to call sc.lastMethod()");
		sc.lastMethod();
	}
	synchronized void lastMethod() {
		System.out.println("Inside FC.lastMethod()");
	}
}
