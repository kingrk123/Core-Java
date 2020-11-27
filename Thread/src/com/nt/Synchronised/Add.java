package com.nt.Synchronised;

public class Add {

	int x,y;
	//void add(int x, int y) {
	synchronized void add(int x, int y) {
		this.x = x;
		this.y = y;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int res = this.x +this.y;
		
		System.out.println("In "+Thread.currentThread().getName()+" Result "+res);
	} 
}
