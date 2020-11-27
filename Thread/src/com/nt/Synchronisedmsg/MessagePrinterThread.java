package com.nt.Synchronisedmsg;

public class MessagePrinterThread implements Runnable {

	String msg;
	PrintMessage pm;
	
	
	public MessagePrinterThread(PrintMessage pm, String msg) {
		this.pm = pm;
		this.msg = msg;
	}
	
	Thread th = new Thread(this);
	//th.start();
	@Override
	public void run() {
		pm.printmssg(msg);

	}

}
