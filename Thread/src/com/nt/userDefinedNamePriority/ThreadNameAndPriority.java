package com.nt.userDefinedNamePriority;

public class ThreadNameAndPriority {

	public static void main(String[] args) {
		MyThread mt  = new MyThread();
		MyThread mt1 = new MyThread("Child2");
		
		System.out.println("mt Thread's initial name and priority");
		System.out.println("mt Name: "+mt.getName());
		System.out.println("mt Priority: "+mt.getPriority());
		
		System.out.println();
		
		System.out.println("mt1 Thread's initial name and priority");
		System.out.println("mt1 Name: "+mt1.getName());
		System.out.println("mt1 Priority: "+mt1.getPriority());
		System.out.println();
		
		mt.setName("Child1");
		mt.setPriority(6);
		
		mt1.setPriority(9);
		
		System.out.println("mt Thread's Changed name and priority");
		System.out.println("mt Name: "+mt.getName());
		System.out.println("mt Priority: "+mt.getPriority());
		
		System.out.println();
		
		System.out.println("mt1 Thread's Changed name and priority");
		System.out.println("mt1 Name: "+mt1.getName());
		System.out.println("mt1 Priority: "+mt1.getPriority());
		
		mt.start();
		mt1.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main: "+i);
		}
		
		
	}

}
