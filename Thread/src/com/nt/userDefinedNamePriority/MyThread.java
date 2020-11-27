package com.nt.userDefinedNamePriority;

public class MyThread extends Thread {

	public MyThread() {
		super();
	}
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+" i: "+i);
		}
	}
	
}
