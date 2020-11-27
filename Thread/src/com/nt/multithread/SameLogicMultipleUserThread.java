package com.nt.multithread;

public class SameLogicMultipleUserThread extends Thread {

	@Override
	public void run() {
		for(int i=0; i<=10; ++i) {
			System.out.println(getName()+" Run: " +i);
		}
	}
	
	
	public static void main(String[] args) {
		SameLogicMultipleUserThread mt = new SameLogicMultipleUserThread();
		mt.start();
		
		SameLogicMultipleUserThread mt1 = new SameLogicMultipleUserThread();
		mt1.start();
		
		SameLogicMultipleUserThread mt2 = new SameLogicMultipleUserThread();
		mt2.start();
		
		
		

	}

}
