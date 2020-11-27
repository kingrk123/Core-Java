package com.nt.bothMethod;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		
			System.out.println(getName()+" From Run Method : ");
		
	}
	public static void main(String[] args) {
		
		System.out.println("From Main Method : ");
		
		 MyThread1 mt = new MyThread1();
		
		  mt.start();			//Thread
		  
		  //System.out.println("From Main Method : ");
		
		 	}

}





