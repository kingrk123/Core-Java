package com.nt.ThreadClass;

public class Client {

	public static void main(String[] args) {
		System.out.println("Method main() runs in thread "+
				Thread.currentThread().getName());
		Counter counterA = new Counter("CounterA");
		Counter counterB = new Counter("CounterB");
		System.out.println("Exit from main() method.");
		
	}
}
