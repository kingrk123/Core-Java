package com.nt.diffSingleMultiThread;

public class MultipleThreadModelApplication2 extends Thread{

	 static PrintNumber pr = new PrintNumber();
	@Override
	public void run() {
		pr.print50To1();
	}
	
	public static void main(String[] args) {
		MultipleThreadModelApplication2 mt =new MultipleThreadModelApplication2();
		long time1 = System.currentTimeMillis();
		mt.start();
		pr.print1To50();
		
		long time2 = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time taken to complete both task: "+((time2-time1)/1000)+" Secs");
	}
}
