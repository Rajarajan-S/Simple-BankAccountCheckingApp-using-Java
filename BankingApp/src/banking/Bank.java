package banking;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.run();
	}
	
	public void run() {
		System.out.println("Welcome to the Bank !");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String Name = sc.next();
		
		Customer customer = new Customer(Name);
		
		System.out.println("Enter your address:");
		String Address = sc.next();
		
		customer.SetAddress(Address);
		
		BankAccount SavingsAccount = new BankAccount("Savins account balance", customer);
		
		System.out.println();
		System.out.println("Customer details:");
		System.out.println();
		System.out.println(SavingsAccount.CustomerDetails());
		
		System.out.println();
		System.out.println(SavingsAccount.AccountDetails());
		
		System.out.println();
		System.out.println("Enter the amount to be deposited:");
		double Amount = sc.nextDouble();
		SavingsAccount.Deposit(Amount);
		System.out.println();
		System.out.println(SavingsAccount.AccountDetails());
		
		System.out.println();
		System.out.println("Enter the amount to withdraw:");
		Amount = sc.nextDouble();
		try {
			SavingsAccount.Withdraw(Amount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println(SavingsAccount.AccountDetails());
		
		sc.close();
	}
}
