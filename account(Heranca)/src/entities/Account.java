package entities;

public class Account {
	protected Integer number;
	protected String holder;
	protected Double balance;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	@Override
	public String toString() {
		var sb = new StringBuilder();
		sb.append("\n");
		sb.append("Holder: ");
		sb.append(holder + "\n");
		sb.append("Number: ");
		sb.append(number + "\n");
		sb.append("Actual balance: ");
		sb.append(balance);
		return sb.toString();
				
	}

	
}
