package com.nt.Theadjoin;

public class Runner1 extends Thread{
	
	public void run() {
		for(int i =0; i<=10; i++) {
			System.out.println("Runner1: "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

}
