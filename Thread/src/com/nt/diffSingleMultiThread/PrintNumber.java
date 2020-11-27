package com.nt.diffSingleMultiThread;

public class PrintNumber {

	void print1To50() {
		for (int i = 0; i <= 50; i++) {
			System.out.print(i+"\t");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	void print50To1() {
		for (int i = 50; i >=0 ; i--) {
			System.out.print(i+"\t");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
