package banking;

public class BankAccount {
	
	String AccountType;
	double Balance;
	Customer customer;
	
	public BankAccount(String AccountType, Customer customer) {
		this.AccountType = AccountType;
		this.customer = customer;
	}
	
	public void Deposit(double Amount) {
		this.Balance += Amount;
	}
	
	public void Withdraw(double Amount) throws Exception {
		if (Amount > this.Balance) {
			throw new Exception("Insufficient Balance");
		}
		this.Balance -= Amount;
	}
	
	public String AccountDetails() {
		return this.AccountType + ": Rs." + this.Balance;
	}
	
	public String CustomerDetails() {
		return this.customer.GetName() + " from " + this.customer.GetAddress();
	}
}


