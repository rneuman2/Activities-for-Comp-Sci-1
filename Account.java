/** NOT CORRECT
 *  Computer Science
 * @author Ryanna Neuman
 *	April 2 2018
 */
public class Account {
	
	private double balance;
	private int secretPin = 2059;
	
	
	public void setBalance(double balance ) {
			this.balance = balance;
	}
	
	public double getBalance() {
	 return balance;
	}
	
	public void makeDeposit(double amtDeposit) {
		balance += amtDeposit;
	}
	
	public void makeWithdrawal(double withdrawal) {
		if (withdrawal <= balance) {
			balance = balance - withdrawal;
		}
	}
		public String describeBalance() {
		String description = "";
		if (balance >= 10000) {
			description = "That's a comfortable balance.";
		} else if (balance >= 1000){
			description = "That's enough for rent and groceries.";
		}else if (balance >= 100) {
			description = "Getting a bit low.";
		}else {
			description = "Time for a deposit!";
		}
			return description;
		}
		
		public String checkPin(int pin) {
			if (secretPin == pin) {
		         return "Correct PIN recongnized";
		      } 
		      else {
		         return "Incorrect Pin";
		      }

		}
		
		public void accumulateInterest(double interestRate) {
			double interest = balance*interestRate;
			balance += interest;
			return;
		}

	}


