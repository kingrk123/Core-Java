package com.nt.Deadlock;

public class DeadLockDemo implements Runnable {

	FirstClass fc = new FirstClass();
	SecondClass sc = new SecondClass();
	public DeadLockDemo() {
		Thread th = new Thread(this , "Racing Thread");
		th.start();
		fc.firstClassMethod(sc);
		System.out.println(" Back in Main Thread");

	}
	
	
	@Override
	public void run() {
		sc.seconClassMethod(fc);
		System.out.println("Back into the other thread");
	}
	
	public static void main(String[] args) {
		new DeadLockDemo();
	}

}
