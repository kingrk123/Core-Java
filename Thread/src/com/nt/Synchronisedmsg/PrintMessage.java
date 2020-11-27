package com.nt.Synchronisedmsg;

public class PrintMessage {

	synchronized void printmssg(String msg) {
		System.out.println("{ "+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" }");
	}
}
