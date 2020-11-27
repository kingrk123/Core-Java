package com.nt.Daemons;

public class MyThread extends Thread {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.setDaemon(true);
		
		mt.start();
		//mt.setDaemon(true);
		

	}

}
