package com.nt.ThreadClass;

public class Counter extends Thread {
	private int currentValue;
	public Counter(String threadName) {
		super(threadName);
		currentValue = 0; 
		System.out.println(this);
		start();
	}
	public int getValue() {
		return currentValue;
	}
	@Override
	public void run() {
		try {
		while (currentValue < 5) {
			System.out.println(Thread.currentThread().getName()+": "+(currentValue++));
			
				Thread.sleep(250);
			}} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+" interrupted.");
			}
		System.out.println("Exit From Thread: "+Thread.currentThread().getName());
		}

	}
