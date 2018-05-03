/*
 * Ryanna Neuman
 * April 3 2018
 */
import java.util.Scanner;
public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		BankAccount bank = new BankAccount();
		
		System.out.println("What is the current Balance?");
		double Balance = scnr.nextDouble();
				
		
		System.out.println("$" + bank.Constructor(Balance));
		
		System.out.println("Make a Deposit");
		double deposit = scnr.nextDouble();
		bank.Deposit(deposit);
		System.out.println("$" + bank.getBalance());
		
		System.out.println("Make a Withdrawl");
		double Withdrawl = scnr.nextDouble();
		bank.Withdraw(Withdrawl);
		System.out.println("$" + bank.getBalance());
		
		System.out.println("Acculate Intrest");
		bank.accrueIntrest();
		System.out.println("$" + bank.getBalance());
		
		
		
		

	}
}

