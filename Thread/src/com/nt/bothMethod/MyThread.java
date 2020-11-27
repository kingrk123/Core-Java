package com.nt.bothMethod;

public class MyThread extends Thread {

	@Override
	public void run() {
		for(int i = 0 ; i<=10; ++i ) {
			System.out.println(getName()+" From Run Method : "+i);
		}
	}
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.run();			//Normal Method
		
		mt.start();			//Thread
		//mt.run();
		
		  for(int i = 0 ; i<=10; ++i ) { System.out.println("From Main Method : "+i); }
		 
		
		
		
		

	}

}
