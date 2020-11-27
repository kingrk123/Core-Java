package com.nt.customThreadCreation;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Run: ");
	}
	@Override
	public void start() {
		System.out.println("Start: ");
		super.start();
	}
	public static void main(String[] args) {
		
		MyThread mt =new MyThread();
		mt.start();
		System.out.println("Main");
	}

}
