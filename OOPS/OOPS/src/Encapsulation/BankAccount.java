package Encapsulation;

public class BankAccount {
	private double balance;
	public void setbalance(double balance) {
		if(balance <=0) {
			System.out.println("Do not Enter -ve value");
		}else {
			this.balance = balance;
		}
	} 
	public double getbalance() {
		return balance;
	}

}
