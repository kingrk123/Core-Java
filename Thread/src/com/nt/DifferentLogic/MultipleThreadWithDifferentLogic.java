package com.nt.DifferentLogic;

public class MultipleThreadWithDifferentLogic {

	public static void main(String[] args) {
		System.out.println("Main Thread: ");
		
		SubThread sub = new SubThread();
		sub.start();
		
		AddThread add = new AddThread();
		add.start();
		
		
		
		System.out.println("Main Thread Exist: ");
	}

}
