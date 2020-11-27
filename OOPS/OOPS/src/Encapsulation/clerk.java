package Encapsulation;

public class clerk {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(); 
		acc1.setbalance(5000);
		System.out.println(acc1.getbalance());
		
		  acc1.setbalance(-5000);
		System.out.println(acc1.getbalance());
		
		
		

	}

}