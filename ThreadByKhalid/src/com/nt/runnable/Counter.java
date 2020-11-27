package com.nt.runnable;

public class Counter implements Runnable {

	private int currentValue;
	public Counter() {
		currentValue = 0; 
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


