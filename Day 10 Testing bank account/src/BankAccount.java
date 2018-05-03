/*
 * Ryanna Neuman
 * April 3 2018
 */
public class BankAccount {

	double Balance = 0;
	
	public double Constructor(double startBalance) {
		Balance = startBalance;
		 return Balance;
	}
	
	public double getBalance() {
		 return Balance;
	}
	
	public void Deposit(double deposit) {
		  Balance = Balance + deposit;
	}
	
	public void Withdraw(double withdraw) {
		  Balance -= withdraw;

	}
	
	public void accrueIntrest() {
		 double intrest = (Balance * 0.10);
		 Balance += intrest;			 
	}
	
	
	
	
	
	
	
	
	
	
}
