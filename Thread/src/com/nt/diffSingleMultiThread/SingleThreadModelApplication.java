package com.nt.diffSingleMultiThread;

public class SingleThreadModelApplication {

	public static void main(String[] args) {
		PrintNumber pr = new PrintNumber();
		long time1 = System.currentTimeMillis();
		pr.print1To50();
		System.out.println();
		pr.print50To1();
		long time2 = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time taken to complete both task: "+((time2-time1)/1000)+" Secs");
	}
}
