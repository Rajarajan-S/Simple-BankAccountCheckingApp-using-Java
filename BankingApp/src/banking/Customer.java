package banking;

public class Customer {
	
	String Name;
	String Address;
	
	public Customer(String Name) {
		this.Name = Name;
	}
	
	public void SetAddress(String Address) {
		this.Address = Address;
	}
	
	public String GetName() {
		return this.Name;
	}
	
	public String GetAddress() {
		return this.Address;
	}
}
