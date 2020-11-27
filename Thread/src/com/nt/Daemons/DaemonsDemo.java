package com.nt.Daemons;

public class DaemonsDemo extends Thread {

	Thread th;
	
	public DaemonsDemo() {
		th = new Thread(this);
		
		th.setDaemon(true);
		th.start();
	}
	
	@Override
	public void run() {
		System.out.println("Run: "+th.isDaemon());
		for (int i = 0; i <=  100; i++) {
			System.out.println("Run: "+i);
		}
	}
	public static void main(String[] args) {
		DaemonsDemo dd = new DaemonsDemo();
		System.out.println("Baba countdown starts");
		for (int i = 1; i <=5; i++) {
			System.out.println("Main: "+i);
		}

	}

}
