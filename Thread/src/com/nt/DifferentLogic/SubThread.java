package com.nt.DifferentLogic;

public class SubThread extends Thread {

	
	  int subt = 1275;
	  
	  @Override 
	  public void run() {
	   for (int i = 50; i >=0; --i) { 
	   	subt-=i;
	  		System.out.println("Substraction: "+subt); 
	  }
	  }

	
	
}

