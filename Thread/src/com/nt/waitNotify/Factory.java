package com.nt.waitNotify;

public class Factory {

	int items;
	
	boolean itemInFactory;
	
	synchronized void produce(int items) {
		if(itemInFactory) {
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		this.items =items;
		itemInFactory=true;
		
		System.out.println("Produce items:" +items);
		
		notify();
	}
	synchronized int consume() {
		if(!itemInFactory){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("items consumed: "+items);
			itemInFactory = false;
			
			notifyAll();
			
		}
		return items;
	}
}
