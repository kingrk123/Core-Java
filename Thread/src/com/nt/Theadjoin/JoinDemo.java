package com.nt.Theadjoin;

public class JoinDemo extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(getName()+" : "+i);
			
			if(i==5 && getName().equals("Child2")) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread Started: ");
		JoinDemo jd1 =new JoinDemo();
		jd1.setName("Child1");
		jd1.start();
		
		JoinDemo jd2 = new JoinDemo();
		jd2.setName("Child2");
		jd2.start();
		
		jd1.join();
		jd2.join();
		
		System.out.println("Main is existed");
		

	}

}
