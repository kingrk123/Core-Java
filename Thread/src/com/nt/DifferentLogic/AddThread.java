package com.nt.DifferentLogic;

public class AddThread extends Thread {

	int sum =0;
	@Override
	public void run() {
		for(int i=0; i<=50;i++) {
			sum+=i;
			System.out.println("Summation "+sum);
		}
	}
}
