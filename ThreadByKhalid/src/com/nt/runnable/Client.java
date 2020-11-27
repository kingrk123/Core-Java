package com.nt.runnable;

public class Client {
	public static void main(String[] args) {
		Counter counterA = new Counter();
		Thread worker = new Thread(counterA, "Counter A");
		System.out.println(worker);
		worker.start();
	
		try {
		int val ;
		do {
			val = counterA.getValue();
			System.out.println("Counter value read by "
					+Thread.currentThread().getName()+": "+val);
			
				Thread.sleep(1000);
			} 
		while(val < 5);
	}catch (InterruptedException e) {
		System.out.println("The Main Thread is Interrupted.");
	}
		System.out.println("Exit feom main() method.");
}
}