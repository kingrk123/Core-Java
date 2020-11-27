package com.nt.multithread;

public class SameLogicDifferentState extends Thread {

	int x;
	
	public SameLogicDifferentState() {
		x=5;
	}
	
	
	public SameLogicDifferentState(int x) {
		this.x = x;
	}
	@Override
	public void run() {
		for(int i=0; i<=10; ++i) {
			System.out.println(getName()+" Run: " +i);
		}
	}
	public static void main(String[] args) {
		
		SameLogicDifferentState mt =new SameLogicDifferentState();
		mt.start();
		
		SameLogicDifferentState mt1 =new SameLogicDifferentState(10);
		mt1.start();
		
		SameLogicDifferentState mt2 =new SameLogicDifferentState(20);
		mt2.start();
		
	}

}
